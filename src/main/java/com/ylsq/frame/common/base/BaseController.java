package com.ylsq.frame.common.base;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylsq.frame.sys.dao.model.SysParamValue;
import com.ylsq.frame.sys.service.SysParamValueService;

public abstract class BaseController {
	private static Logger log = LoggerFactory.getLogger(BaseController.class);
	@Autowired
	private SysParamValueService sysParamValueService;
	
	@RequestMapping(value= "/list", method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
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
	
	protected void beforeEdit(ModelMap modelMap) {
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
