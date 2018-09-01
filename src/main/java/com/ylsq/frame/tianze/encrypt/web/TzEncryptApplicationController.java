package com.ylsq.frame.tianze.encrypt.web;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ylsq.frame.common.base.BaseController;
import com.ylsq.frame.common.base.BaseExample;
import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.common.base.SysParamEnum;
import com.ylsq.frame.common.base.ValidateResult;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptApplication;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptApplicationExample;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptApplicationService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/tz/app")
public class TzEncryptApplicationController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(TzEncryptApplicationController.class);
	
	@Autowired
	private TzEncryptApplicationService tzEncryptApplicationService;
	
	@Override
	public String list(@RequestParam(required = false, defaultValue = "1", value = "pageNum")int pageNum,ModelMap modelMap) {
		// TODO Auto-generated method stub
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		modelMap.put("modelList", tzEncryptApplicationService.selectByExampleForStartPage(new TzEncryptApplicationExample(), pageNum, pageSize));
		modelMap.put("total", tzEncryptApplicationService.countByExample(new TzEncryptApplicationExample()));
		modelMap.put("appTypeList", getParams(SysParamEnum.Application_Type.getConstant()));
		return webPrefix() + "list";
	}

	protected ValidateResult validate(TzEncryptApplication model) {
		return ValidateResult.Passed;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(TzEncryptApplication model,ModelMap modelMap) {
		log.debug(model.toString());
		initModel(model);
		
		ValidateResult vr = validate(model);
		if(!vr.isPassed()) {
			modelMap.put("model", model);
			modelMap.put("errorMsg", vr.getMsg());
			log.error(vr.getMsg());
			return webPrefix()+"edit";
		}
		if(model.getId() == null) {
			tzEncryptApplicationService.insert(model);
		}
		else {
			tzEncryptApplicationService.updateByPrimaryKey(model);
		}
		return list(modelMap);
	}
	
	@Override
	protected void beforeEdit(ModelMap modelMap) {
		// TODO Auto-generated method stub
		modelMap.put("appTypeList", getParams(SysParamEnum.Application_Type.getConstant()));
		super.beforeEdit(modelMap);
	}

	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return tzEncryptApplicationService;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/tz/app/";
	}
}