package com.ylsq.frame.tianze.strategy.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.common.base.BaseModelController;
import com.ylsq.frame.sys.secu.dao.model.SecuRole;
import com.ylsq.frame.sys.secu.dao.model.SecuRoleExample;
import com.ylsq.frame.sys.secu.service.SecuRoleService;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyRole;
import com.ylsq.frame.tianze.strategy.service.TzStrategyRoleService;



/**
 * Created by Harper.
 */
public abstract class TzStrategyRoleController extends BaseModelController {
    private static final Logger log = LoggerFactory.getLogger(TzStrategyRoleController.class);
	
	@Autowired
	private SecuRoleService secuRoleService;
	@Autowired
	private TzStrategyRoleService strategyRoleService;
	
	
	abstract protected BaseModel getCurrentStrategy(String strategyName);
	abstract protected String getStrategyType();
	
	@RequestMapping(value="/configGroups/{strategyName}", method = RequestMethod.GET)
	public String configGroups(@PathVariable(name="strategyName") String strategyName, ModelMap modelMap) {
		List<TzStrategyRole> mappingList = strategyRoleService.selectByStrategyName(strategyName);
		List<String> selectedRoleNames = new ArrayList<String>();
		for(TzStrategyRole tsu: mappingList)
			selectedRoleNames.add(tsu.getRoleName());
		
		List<SecuRole> unselectedRoles = new ArrayList<>();
		List<SecuRole> selectedRoles = new ArrayList<>();
		List<SecuRole> allRoles = secuRoleService.selectByExample(new SecuRoleExample());
		for(SecuRole role: allRoles) {
			if(selectedRoleNames.contains(role.getRoleName())) {
				selectedRoles.add(role);
			}
			else {
				unselectedRoles.add(role);
			}
		}
		log.debug("size:" + mappingList.size());
		modelMap.put("strategyType", getStrategyType());
		modelMap.put("selectedList", selectedRoles);
		modelMap.put("unselectedList", unselectedRoles);
		modelMap.put("strategy", getCurrentStrategy(strategyName));
		
		return "/tz/strategy/configGroups";
	}
	
	
	@RequestMapping(value="/configGroups", method = RequestMethod.POST)
	public String configGroups(@RequestParam(value="strategyName") String strategyName, @RequestParam(value="selectedIds") String selectedRoleNames, ModelMap modelMap) {
		log.debug(strategyName);
		List<TzStrategyRole> mappingList = strategyRoleService.selectByStrategyName(strategyName);
		Map<String,TzStrategyRole> existingMap = new HashMap<>();
		for(TzStrategyRole tsu: mappingList)
			existingMap.put(tsu.getRoleName(),tsu);
		
		String[] idArray = StringUtils.defaultIfEmpty(selectedRoleNames, "").split("-");
		for(String rolerName : idArray) {
			if(existingMap.keySet().contains(rolerName)) {
				mappingList.remove(existingMap.get(rolerName));
			}
			else {
				TzStrategyRole tsu = new TzStrategyRole();
				tsu.setStrategyName(strategyName);
				tsu.setRoleName(rolerName);
				tsu.setStrategyType(getStrategyType());
				initModel(tsu);
				strategyRoleService.insert(tsu);
			}
		}
		for(TzStrategyRole sur: mappingList) {
			strategyRoleService.deleteByPrimaryKey(sur.getId());
		}
		return list(modelMap);
	}
}