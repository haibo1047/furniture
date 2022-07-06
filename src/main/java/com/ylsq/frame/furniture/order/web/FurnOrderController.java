package com.ylsq.frame.furniture.order.web;

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
import com.ylsq.frame.furniture.customer.dao.model.FurnCustomerExample;
import com.ylsq.frame.furniture.customer.service.FurnCustomerService;
import com.ylsq.frame.furniture.order.dao.model.FurnOrder;
import com.ylsq.frame.furniture.order.dao.model.FurnOrderExample;
import com.ylsq.frame.furniture.order.service.FurnOrderService;
import com.ylsq.frame.furniture.product.dao.model.FurnProductExample;
import com.ylsq.frame.furniture.product.service.FurnProductService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/furniture/order")
public class FurnOrderController extends BaseModelController {
    private static final Logger log = LoggerFactory.getLogger(FurnOrderController.class);
	
	@Autowired
	private FurnOrderService furnOrderService;
	@Autowired
	private FurnProductService furnProductService;
	@Autowired
	private FurnCustomerService furnCustomerService;
	
	
	@Override
	public String list(@RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum,ModelMap modelMap) {
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		List<FurnOrder> list = furnOrderService.selectByExampleForStartPage(new FurnOrderExample(),pageNum,pageSize);
		
		modelMap.put("modelList", list);
		modelMap.put("total", furnOrderService.countByExample(new FurnOrderExample()));
		
		modelMap.put("productList", furnProductService.selectByExample(new FurnProductExample()));
		modelMap.put("customerList", furnCustomerService.selectByExample(new FurnCustomerExample()));
		return webPrefix() + "list";
	}
	
	protected ValidateResult validate(FurnOrder model) {
		return ValidateResult.Passed;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(FurnOrder model,ModelMap modelMap) {
		log.debug(model.toString());
		initModel(model);
		
		ValidateResult vr = validate(model);
		if(!vr.isPassed()) {
			modelMap.put("model", model);
			modelMap.put("errorMsg", vr.getMsg());
			return webPrefix()+"edit";
		}
		if(model.getId() == null) {
			furnOrderService.insert(model);
		}
		else {
			furnOrderService.updateByPrimaryKey(model);
		}
		return list(modelMap);
	}
	
	@Override
	protected void beforeEdit(ModelMap modelMap) {
		modelMap.put("productList", furnProductService.selectByExample(new FurnProductExample()));
		modelMap.put("customerList", furnCustomerService.selectByExample(new FurnCustomerExample()));
		super.beforeEdit(modelMap);
	}

	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return furnOrderService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<FurnOrder> list = furnOrderService.selectByExample(new FurnOrderExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		return "/furniture/order/";
	}
}