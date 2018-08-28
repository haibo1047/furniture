package com.ylsq.frame.common.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylsq.frame.sys.base.dao.model.SysParamValue;
import com.ylsq.frame.sys.base.service.SysParamValueService;

public abstract class BaseController {
	private static Logger log = LoggerFactory.getLogger(BaseController.class);
	@Autowired
	private SysParamValueService sysParamValueService;
	
	@InitBinder
    public void InitBinder(WebDataBinder binder){
        DateFormat dateFormat = new SimpleDateFormat(SystemConstants.NormalDF);
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	@RequestMapping(value= "/list", method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		log.debug("displaying LIST page");
		beforeList(modelMap);
		List<? extends BaseModel> list = getModelList();
		modelMap.put("modelList", list);
		return webPrefix()+"list";
	}
	
	@RequestMapping(value= "/create", method = RequestMethod.GET)
	public String create(ModelMap modelMap) {
		beforeEdit(modelMap);
		return webPrefix()+"edit";
	}
	
	@RequestMapping(value= "/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable(name="id") String id,ModelMap modelMap) {
		log.debug(id);
		beforeEdit(modelMap);
		BaseModel model = getService().selectByPrimaryKey(Long.parseLong(id));
		modelMap.put("model", model);
		return webPrefix()+"edit";
	}
	
	@RequestMapping(value= "/delete/{ids}", method = RequestMethod.GET)
	public String delete(@PathVariable(name="ids") String ids,ModelMap modelMap) {
		int cnt = getService().deleteByPrimaryKeys(ids);
		log.debug(cnt + ":" + ids);
		return list(modelMap);
	}
	
	protected List<SysParamValue> getParams(String paramName){
		return sysParamValueService.selectByParamName(paramName);
	}
	
	protected ValidateResult uniqCheck() {
		return ValidateResult.Passed;
	}
	protected void beforeEdit(ModelMap modelMap) {
	}
	protected void beforeList(ModelMap modelMap) {
	}
	public String currentLogin() {
		return (String)SecurityUtils.getSubject().getPrincipal();
	}
	
    public String getIp(HttpServletRequest request) {
        String Xip = request.getHeader("X-Real-IP");
        String XFor = request.getHeader("X-Forwarded-For");
        if(StringUtils.isNotEmpty(XFor) && !"unKnown".equalsIgnoreCase(XFor)){
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = XFor.indexOf(",");
            if(index != -1){
                return XFor.substring(0,index);
            }else{
                return XFor;
            }
        }
        XFor = Xip;
        if(StringUtils.isNotEmpty(XFor) && !"unKnown".equalsIgnoreCase(XFor)){
            return XFor;
        }
        if (StringUtils.isBlank(XFor) || "unknown".equalsIgnoreCase(XFor)) {
            XFor = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isBlank(XFor) || "unknown".equalsIgnoreCase(XFor)) {
            XFor = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isBlank(XFor) || "unknown".equalsIgnoreCase(XFor)) {
            XFor = request.getHeader("HTTP_CLIENT_IP");
        }
        if (StringUtils.isBlank(XFor) || "unknown".equalsIgnoreCase(XFor)) {
            XFor = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (StringUtils.isBlank(XFor) || "unknown".equalsIgnoreCase(XFor)) {
            XFor = request.getRemoteAddr();
        }
        return XFor;
    }
    
    
	protected void initModel(BaseModel obj) {
		if(obj == null)
			return;
		String currUser = (String)SecurityUtils.getSubject().getPrincipal();
//		String currUser = "test";
		if(obj.getId() == null) {
			obj.setCreateTime(new Date());
			obj.setCreateUser(currUser);
			obj.setRecStatus(BaseModel.recStatus_valid);
		}
		else {
			obj.setCreateTime(new Date());
			obj.setCreateUser(currUser);
			obj.setRecStatus(BaseModel.recStatus_valid);
		}
	}
	
	protected BaseService<? extends BaseModel,? extends BaseExample> getService() {
		throw new UnsupportedOperationException();
	}
	
	protected List<? extends BaseModel> getModelList(){
		throw new UnsupportedOperationException();
	}
	
	protected String webPrefix() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 统一异常处理
	 * @param request
	 * @param response
	 * @param exception
	 */
	@ExceptionHandler
	public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
		log.error(exception.getMessage());
		exception.printStackTrace();
		request.setAttribute("ex", exception);
		return "/common/error";
	}
}
