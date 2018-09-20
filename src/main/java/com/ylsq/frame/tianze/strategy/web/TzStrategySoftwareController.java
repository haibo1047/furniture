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
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategySoftware;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategySoftwareExample;
import com.ylsq.frame.tianze.strategy.service.TzStrategySoftwareService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("tz_strategy_software")
public class TzStrategySoftwareController extends BaseModelController {
    private static final Logger log = LoggerFactory.getLogger(TzStrategySoftwareController.class);
	
	@Autowired
	private TzStrategySoftwareService tzStrategySoftwareService;
	
	
	@Override
	public String list(@RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum,ModelMap modelMap) {
		// TODO Auto-generated method stub
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		List<TzStrategySoftware> list = tzStrategySoftwareService.selectByExampleForStartPage(new TzStrategySoftwareExample(),pageNum,pageSize);
		
		modelMap.put("modelList", list);
		modelMap.put("total", tzStrategySoftwareService.countByExample(new TzStrategySoftwareExample()));
		return webPrefix() + "list";
	}
	
	protected ValidateResult validate(TzStrategySoftware model) {
		return ValidateResult.Passed;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(TzStrategySoftware model,ModelMap modelMap) {
		log.debug(model.toString());
		initModel(model);
		
		ValidateResult vr = validate(model);
		if(!vr.isPassed()) {
			modelMap.put("model", model);
			modelMap.put("errorMsg", vr.getMsg());
			return webPrefix()+"edit";
		}
		if(model.getId() == null) {
			tzStrategySoftwareService.insert(model);
		}
		else {
			tzStrategySoftwareService.updateByPrimaryKey(model);
		}
		return list(modelMap);
	}
	
	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return tzStrategySoftwareService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<TzStrategySoftware> list = tzStrategySoftwareService.selectByExample(new TzStrategySoftwareExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return super.webPrefix();
	}
}