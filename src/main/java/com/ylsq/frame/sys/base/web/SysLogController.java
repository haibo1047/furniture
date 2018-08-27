package com.ylsq.frame.sys.base.web;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylsq.frame.common.base.BaseController;
import com.ylsq.frame.common.base.BaseExample;
import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.common.base.ValidateResult;
import com.ylsq.frame.sys.base.dao.model.SysLog;
import com.ylsq.frame.sys.base.dao.model.SysLogExample;
import com.ylsq.frame.sys.base.service.SysLogService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/sys_log")
public class SysLogController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(SysLogController.class);
	
	@Autowired
	private SysLogService sysLogService;
	
	protected ValidateResult validate(SysLog model) {
		return ValidateResult.Passed;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(SysLog model,ModelMap modelMap) {
		log.debug(model.toString());
		initModel(model);
		
		ValidateResult vr = validate(model);
		if(!vr.isPassed()) {
			modelMap.put("model", model);
			modelMap.put("errorMsg", vr.getMsg());
			return webPrefix()+"edit";
		}
		if(model.getId() == null) {
			sysLogService.insert(model);
		}
		else {
			sysLogService.updateByPrimaryKey(model);
		}
		return list(modelMap);
	}
	
	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return sysLogService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<SysLog> list = sysLogService.selectByExample(new SysLogExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return super.webPrefix();
	}
}