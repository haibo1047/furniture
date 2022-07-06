package com.ylsq.frame.furniture.customer.web;

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
import com.ylsq.frame.furniture.customer.dao.model.FurnCustomer;
import com.ylsq.frame.furniture.customer.dao.model.FurnCustomerExample;
import com.ylsq.frame.furniture.customer.service.FurnCustomerService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/furniture/customer")
public class FurnCustomerController extends BaseModelController {
    private static final Logger log = LoggerFactory.getLogger(FurnCustomerController.class);
	
	@Autowired
	private FurnCustomerService furnCustomerService;
	
	
	@Override
	public String list(@RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum,ModelMap modelMap) {
		// TODO Auto-generated method stub
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		List<FurnCustomer> list = furnCustomerService.selectByExampleForStartPage(new FurnCustomerExample(),pageNum,pageSize);
		modelMap.put("modelList", list);
		modelMap.put("total", furnCustomerService.countByExample(new FurnCustomerExample()));
		return webPrefix() + "list";
	}
	
	protected ValidateResult validate(FurnCustomer model) {
		return ValidateResult.Passed;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(FurnCustomer model,ModelMap modelMap) {
		log.debug(model.toString());
		initModel(model);
		
		ValidateResult vr = validate(model);
		if(!vr.isPassed()) {
			modelMap.put("model", model);
			modelMap.put("errorMsg", vr.getMsg());
			return webPrefix()+"edit";
		}
		if(model.getId() == null) {
			furnCustomerService.insert(model);
		}
		else {
			furnCustomerService.updateByPrimaryKey(model);
		}
		return list(modelMap);
	}
	
	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return furnCustomerService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<FurnCustomer> list = furnCustomerService.selectByExample(new FurnCustomerExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		return "/furniture/customer/";
	}
}