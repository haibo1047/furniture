package com.ylsq.frame.furniture.product.web;

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
import com.ylsq.frame.common.base.SysParamEnum;
import com.ylsq.frame.common.base.ValidateResult;
import com.ylsq.frame.furniture.product.dao.model.FurnProduct;
import com.ylsq.frame.furniture.product.dao.model.FurnProductExample;
import com.ylsq.frame.furniture.product.service.FurnProductService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/furniture/product")
public class FurnProductController extends BaseModelController {
    private static final Logger log = LoggerFactory.getLogger(FurnProductController.class);
	
	@Autowired
	private FurnProductService furnProductService;
	
	
	@Override
	public String list(@RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum,ModelMap modelMap) {
		// TODO Auto-generated method stub
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		List<FurnProduct> list = furnProductService.selectByExampleForStartPage(new FurnProductExample(),pageNum,pageSize);
		
		modelMap.put("modelList", list);
		modelMap.put("total", furnProductService.countByExample(new FurnProductExample()));
		
		modelMap.put("productTypeList", getParams(SysParamEnum.Product_Type.getConstant()));
		return webPrefix() + "list";
	}
	
	protected ValidateResult validate(FurnProduct model) {
		return ValidateResult.Passed;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(FurnProduct model,ModelMap modelMap) {
		log.debug(model.toString());
		initModel(model);
		
		ValidateResult vr = validate(model);
		if(!vr.isPassed()) {
			modelMap.put("model", model);
			modelMap.put("errorMsg", vr.getMsg());
			return webPrefix()+"edit";
		}
		if(model.getId() == null) {
			furnProductService.insert(model);
		}
		else {
			furnProductService.updateByPrimaryKey(model);
		}
		return list(modelMap);
	}
	
	
	@Override
	protected void beforeEdit(ModelMap modelMap) {
		// TODO Auto-generated method stub
		modelMap.put("productTypeList", getParams(SysParamEnum.Product_Type.getConstant()));
		super.beforeEdit(modelMap);
	}

	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return furnProductService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<FurnProduct> list = furnProductService.selectByExample(new FurnProductExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/furniture/product/";
	}
}