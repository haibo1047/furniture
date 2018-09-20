package com.ylsq.frame.tianze.strategy.web;

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
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermark;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermarkExample;
import com.ylsq.frame.tianze.strategy.service.TzStrategyWatermarkService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("tz_strategy_watermark")
public class TzStrategyWatermarkController extends BaseModelController {
    private static final Logger log = LoggerFactory.getLogger(TzStrategyWatermarkController.class);
	
	@Autowired
	private TzStrategyWatermarkService tzStrategyWatermarkService;
	
	
	@Override
	public String list(@RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum,ModelMap modelMap) {
		// TODO Auto-generated method stub
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		List<TzStrategyWatermark> list = tzStrategyWatermarkService.selectByExampleForStartPage(new TzStrategyWatermarkExample(),pageNum,pageSize);
		
		modelMap.put("modelList", list);
		modelMap.put("total", tzStrategyWatermarkService.countByExample(new TzStrategyWatermarkExample()));
		return webPrefix() + "list";
	}
	
	protected ValidateResult validate(TzStrategyWatermark model) {
		return ValidateResult.Passed;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(TzStrategyWatermark model,ModelMap modelMap) {
		log.debug(model.toString());
		initModel(model);
		
		ValidateResult vr = validate(model);
		if(!vr.isPassed()) {
			modelMap.put("model", model);
			modelMap.put("errorMsg", vr.getMsg());
			return webPrefix()+"edit";
		}
		if(model.getId() == null) {
			tzStrategyWatermarkService.insert(model);
		}
		else {
			tzStrategyWatermarkService.updateByPrimaryKey(model);
		}
		return list(modelMap);
	}
	
	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return tzStrategyWatermarkService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<TzStrategyWatermark> list = tzStrategyWatermarkService.selectByExample(new TzStrategyWatermarkExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return super.webPrefix();
	}
}