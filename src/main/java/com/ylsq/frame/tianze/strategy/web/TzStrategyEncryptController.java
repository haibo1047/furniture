package com.ylsq.frame.tianze.strategy.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ylsq.frame.common.base.BaseController;
import com.ylsq.frame.common.base.SysParamEnum;
import com.ylsq.frame.common.base.ValidateResult;
import com.ylsq.frame.sys.base.dao.model.SysParamValue;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptApplication;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptApplicationExample;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptApplicationService;
import com.ylsq.frame.tianze.remoting.tranfer.StrategyEncrypt;
import com.ylsq.frame.tianze.strategy.custobj.StrategyApplications;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyEncrypt;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyEncryptExample;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermark;
import com.ylsq.frame.tianze.strategy.service.TzStrategyEncryptService;
import com.ylsq.frame.tianze.strategy.service.TzStrategyWatermarkService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/tz/strategy/encrypt")
public class TzStrategyEncryptController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(TzStrategyEncryptController.class);
	
	@Autowired
	private TzStrategyEncryptService tzStrategyEncryptService;
	@Autowired
    private TzStrategyWatermarkService watermarkService;
	@Autowired
	private TzEncryptApplicationService applicationService;
	
	
	public String list(ModelMap modelMap) {
		return list(1,modelMap);
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String list(@RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum,ModelMap modelMap) {
		// TODO Auto-generated method stub
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		List<TzStrategyEncrypt> list = tzStrategyEncryptService.selectByExampleForStartPage(new TzStrategyEncryptExample(),pageNum,pageSize);
		
		modelMap.put("modelList", list);
		modelMap.put("total", tzStrategyEncryptService.countByExample(new TzStrategyEncryptExample()));
		return webPrefix() + "list";
	}
	
	protected ValidateResult validate(StrategyEncrypt model) {
		return ValidateResult.Passed;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(StrategyEncrypt model,ModelMap modelMap) {
		log.debug(model.toString());
		
		ValidateResult vr = validate(model);
		if(!vr.isPassed()) {
			modelMap.put("model", model);
			modelMap.put("errorMsg", vr.getMsg());
			return webPrefix()+"edit";
		}
		TzStrategyEncrypt strategy = model.toStrategy();
		TzStrategyWatermark watermark = model.toWatermark();
		initModel(strategy);
		initModel(watermark);
		if(model.getId() == null) {
			tzStrategyEncryptService.insert(strategy, watermark);
		}
		else {
			tzStrategyEncryptService.update(strategy, watermark);
		}
		return list(modelMap);
	}
	
	@RequestMapping(value= "/delete/{ids}", method = RequestMethod.GET)
	public String delete(@PathVariable(name="ids") String ids,ModelMap modelMap) {
		int cnt = tzStrategyEncryptService.deleteByPrimaryKeys(ids);
		log.debug(cnt + ":" + ids);
		return list(modelMap);
	}
	
	@RequestMapping(value= "/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable(name="id") String id,ModelMap modelMap) {
		log.debug(id);
		TzStrategyEncrypt strategy = tzStrategyEncryptService.selectByPrimaryKey(Long.parseLong(id));
		TzStrategyWatermark watermark = watermarkService.selectByStrategyId(Long.parseLong(id));
		Map<Integer,String> appTypeMap = new HashMap<>();
		List<SysParamValue> appTypes =  getParams(SysParamEnum.Application_Type.getConstant());
		for(SysParamValue spv : appTypes)
			appTypeMap.put(Integer.parseInt(spv.getValue1()), spv.getValue2());
		List<TzEncryptApplication> appList = applicationService.selectByExample(new TzEncryptApplicationExample());
		Map<Integer,List<TzEncryptApplication>> map = new HashMap<>();
		for(TzEncryptApplication tea: appList) {
			List<TzEncryptApplication> mapValues = map.get(tea.getApplicationType());
			if(mapValues == null) {
				mapValues = new ArrayList<TzEncryptApplication>();
				map.put(tea.getApplicationType(), mapValues);
			}
			mapValues.add(tea);
		}
		List<StrategyApplications> strategApps = new ArrayList<>(map.size());
		for(Map.Entry<Integer, List<TzEncryptApplication>> e: map.entrySet()) {
			StrategyApplications sa = new StrategyApplications();
			sa.setAppType(e.getKey());
			sa.setAppTypeName(appTypeMap.get(e.getKey()));
			sa.setAppList(e.getValue());
			strategApps.add(sa);
		}
		modelMap.put("model", new StrategyEncrypt(strategy,watermark));
		modelMap.put("strategApps", strategApps);
		return webPrefix()+"edit";
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/tz/strategy/encrypt/";
	}
}