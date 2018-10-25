package com.ylsq.frame.tianze.strategy.web;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
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

import com.ylsq.frame.common.base.BaseExample;
import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.common.base.SysParamEnum;
import com.ylsq.frame.common.base.ValidateResult;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyOutgoing;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyOutgoingExample;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyRole;
import com.ylsq.frame.tianze.strategy.service.TzStrategyOutgoingService;
import com.ylsq.frame.tianze.strategy.service.TzStrategyRoleService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/tz/strategy/outgoing")
public class TzStrategyOutgoingController extends TzStrategyRoleController {
    private static final Logger log = LoggerFactory.getLogger(TzStrategyOutgoingController.class);
	
	@Autowired
	private TzStrategyOutgoingService tzStrategyOutgoingService;
	@Autowired
	private TzStrategyRoleService strategyRoleService;
	
	@Override
	protected BaseModel getCurrentStrategy(String strategyName) {
		// TODO Auto-generated method stub
		return tzStrategyOutgoingService.selectByStrategyName(strategyName);
	}

	@Override
	protected String getStrategyType() {
		// TODO Auto-generated method stub
		return TzStrategyOutgoing.Strategy_Type;
	}

	@Override
	protected void beforeList(ModelMap modelMap) {
		// TODO Auto-generated method stub
		super.beforeList(modelMap);
		modelMap.put("outgoingLevelList", getParams(SysParamEnum.Strategy_outgoing_level.getConstant()));
	}

	@Override
	public String list(@RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum,ModelMap modelMap) {
		// TODO Auto-generated method stub
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		List<TzStrategyOutgoing> list = tzStrategyOutgoingService.selectByExampleForStartPage(new TzStrategyOutgoingExample(),pageNum,pageSize);
		
		modelMap.put("modelList", list);
		modelMap.put("total", tzStrategyOutgoingService.countByExample(new TzStrategyOutgoingExample()));
		modelMap.put("outgoingLevelList", getParams(SysParamEnum.Strategy_outgoing_level.getConstant()));
		return webPrefix() + "list";
	}
	
	protected ValidateResult validate(TzStrategyOutgoing model) {
		if(model.getId() != null) {
			TzStrategyOutgoing strategy = tzStrategyOutgoingService.selectByPrimaryKey(model.getId());
			if(!strategy.getStrategyName().equals(model.getStrategyName())) {
				log.warn("策略名不可修改！");
				return new ValidateResult("策略名不允许修改");
			}
		}
		if(StringUtils.isNotBlank(model.getStrategyName())) {
			TzStrategyOutgoing strategy = tzStrategyOutgoingService.selectByStrategyName(model.getStrategyName());
			if(strategy != null && !strategy.getId().equals(model.getId())) {
				return new ValidateResult("策略名已经存在");
			}
		}
		return ValidateResult.Passed;
	}
	
	@Override
	protected void beforeEdit(ModelMap modelMap) {
		// TODO Auto-generated method stub
		super.beforeEdit(modelMap);
		modelMap.put("outgoingLevelList", getParams(SysParamEnum.Strategy_outgoing_level.getConstant()));
	}

	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(TzStrategyOutgoing model,ModelMap modelMap) {
		log.debug(model.toString());
		initModel(model);
		
		ValidateResult vr = validate(model);
		if(!vr.isPassed()) {
			modelMap.put("model", model);
			modelMap.put("errorMsg", vr.getMsg());
			return webPrefix()+"edit";
		}
		if(model.getId() == null) {
			tzStrategyOutgoingService.insert(model);
		}
		else {
			tzStrategyOutgoingService.updateByPrimaryKey(model);
		}
		return list(modelMap);
	}
	
	@Override
	public String delete(@PathVariable(name="ids")String ids, ModelMap modelMap) {
		// TODO Auto-generated method stub
		if(StringUtils.isNotBlank(ids)) {
			String[] idArray = ids.split("-");
			Set<String> failedNames = new HashSet<>();
			for (String idStr : idArray) {
				if (StringUtils.isBlank(idStr)) {
					continue;
				}
				Long uid = Long.parseLong(idStr);
				TzStrategyOutgoing strategy = tzStrategyOutgoingService.selectByPrimaryKey(uid);
				if(strategy != null) {
					List<TzStrategyRole> list = strategyRoleService.selectByStrategyName(strategy.getStrategyName());
					if(list.size() > 0) {
						log.warn(strategy.getStrategyName() + "已经被配置了某些用户，请先移除绑定的用户");
						failedNames.add(strategy.getStrategyName());
						continue;
					}
					tzStrategyOutgoingService.deleteByPrimaryKey(uid);
				}
			}
			
			if(failedNames.size()> 0) {
				modelMap.put("errorMsg", "策略("+String.join(",",failedNames)+")未删除成功，请先移除绑定的用户再重试");
			}
			else {
				modelMap.put("errorMsg", "操作成功");
			}
		}
		return list(1, modelMap);
	}


	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return tzStrategyOutgoingService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<TzStrategyOutgoing> list = tzStrategyOutgoingService.selectByExample(new TzStrategyOutgoingExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/tz/strategy/outgoing/";
	}
}