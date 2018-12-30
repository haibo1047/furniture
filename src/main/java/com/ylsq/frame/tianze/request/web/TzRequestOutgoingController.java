package com.ylsq.frame.tianze.request.web;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.apache.shiro.SecurityUtils;
import com.ylsq.frame.common.base.BaseModelController;
import com.ylsq.frame.common.base.BaseExample;
import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.common.base.ValidateResult;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoing;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoingExample;
import com.ylsq.frame.tianze.request.service.TzRequestOutgoingService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/tz/request")
public class TzRequestOutgoingController extends BaseModelController {
    private static final Logger log = LoggerFactory.getLogger(TzRequestOutgoingController.class);
	
	@Autowired
	private TzRequestOutgoingService tzRequestOutgoingService;
	
	
	@Override
	public String list(@RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum,ModelMap modelMap) {
		// TODO Auto-generated method stub
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		List<TzRequestOutgoing> list = tzRequestOutgoingService.selectByExampleForStartPage(new TzRequestOutgoingExample(),pageNum,pageSize);
		
		modelMap.put("modelList", list);
		modelMap.put("total", tzRequestOutgoingService.countByExample(new TzRequestOutgoingExample()));
		return webPrefix() + "list";
	}
	
	protected ValidateResult validate(TzRequestOutgoing model) {
		return ValidateResult.Passed;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(TzRequestOutgoing model,ModelMap modelMap) {
		log.debug(model.toString());
		initModel(model);
		
		ValidateResult vr = validate(model);
		if(!vr.isPassed()) {
			modelMap.put("model", model);
			modelMap.put("errorMsg", vr.getMsg());
			return webPrefix()+"edit";
		}
		if(model.getId() == null) {
			tzRequestOutgoingService.insert(model);
		}
		else {
			tzRequestOutgoingService.updateByPrimaryKey(model);
		}
		return list(modelMap);
	}
	
	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return tzRequestOutgoingService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<TzRequestOutgoing> list = tzRequestOutgoingService.selectByExample(new TzRequestOutgoingExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/tz/request/";
	}
}