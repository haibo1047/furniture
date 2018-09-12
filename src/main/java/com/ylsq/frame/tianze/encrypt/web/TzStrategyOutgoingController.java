package com.ylsq.frame.tianze.encrypt.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
import com.ylsq.frame.common.base.BaseModelController;
import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.common.base.SysParamEnum;
import com.ylsq.frame.common.base.ValidateResult;
import com.ylsq.frame.sys.secu.dao.model.SecuUser;
import com.ylsq.frame.sys.secu.dao.model.SecuUserExample;
import com.ylsq.frame.sys.secu.service.SecuUserService;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyOutgoing;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyOutgoingExample;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyUser;
import com.ylsq.frame.tianze.encrypt.service.TzStrategyOutgoingService;
import com.ylsq.frame.tianze.encrypt.service.TzStrategyUserService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/tz/strategy/outgoing")
public class TzStrategyOutgoingController extends BaseModelController {
    private static final Logger log = LoggerFactory.getLogger(TzStrategyOutgoingController.class);
	
	@Autowired
	private TzStrategyOutgoingService tzStrategyOutgoingService;
	@Autowired
	private TzStrategyUserService strategyUserService;
	@Autowired
	private SecuUserService secuUserService;
	
	@RequestMapping(value="/configUsers/{strategyName}", method = RequestMethod.GET)
	public String configUsers(@PathVariable(name="strategyName") String strategyName, ModelMap modelMap) {
		TzStrategyOutgoing currStrategy = tzStrategyOutgoingService.selectByStrategyName(strategyName);
		List<TzStrategyUser> mappingList = strategyUserService.selectByStrategyName(strategyName);
		List<String> selectedUserNames = new ArrayList<String>();
		for(TzStrategyUser tsu: mappingList)
			selectedUserNames.add(tsu.getUserName());
		
		List<SecuUser> unselectedUsers = new ArrayList<>();
		List<SecuUser> selectedUsers = new ArrayList<>();
		List<SecuUser> allUsers = secuUserService.selectByExample(new SecuUserExample());
		for(SecuUser user: allUsers) {
			if(selectedUserNames.contains(user.getUserName())) {
				selectedUsers.add(user);
			}
			else {
				unselectedUsers.add(user);
			}
		}
		log.debug("size:" + mappingList.size());
		modelMap.put("selectedList", selectedUsers);
		modelMap.put("unselectedList", unselectedUsers);
		modelMap.put("strategy", currStrategy);
		
		return webPrefix() + "/configUsers";
	}
	
	
	@RequestMapping(value="/configUsers", method = RequestMethod.POST)
	public String configUsers(@RequestParam(value="strategyName") String strategyName, @RequestParam(value="selectedIds") String selectedUserNames, ModelMap modelMap) {
		log.debug(strategyName);
		List<TzStrategyUser> mappingList = strategyUserService.selectByStrategyName(strategyName);
		Map<String,TzStrategyUser> existingMap = new HashMap<>();
		for(TzStrategyUser tsu: mappingList)
			existingMap.put(tsu.getUserName(),tsu);
		
		String[] idArray = StringUtils.defaultIfEmpty(selectedUserNames, "").split("-");
		for(String userName : idArray) {
			if(existingMap.keySet().contains(userName)) {
				mappingList.remove(existingMap.get(userName));
			}
			else {
				TzStrategyUser tsu = new TzStrategyUser();
				tsu.setStrategyName(strategyName);
				tsu.setUserName(userName);
				tsu.setStrategyType(TzStrategyOutgoing.Strategy_Type);
				initModel(tsu);
				strategyUserService.insert(tsu);
			}
		}
		for(TzStrategyUser sur: mappingList) {
			strategyUserService.deleteByPrimaryKey(sur.getId());
		}
		return list(modelMap);
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
					List<TzStrategyUser> list = strategyUserService.selectByStrategyName(strategy.getStrategyName());
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