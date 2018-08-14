package com.ylsq.frame.sys.secu.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
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
import com.ylsq.frame.common.base.BaseExample;
import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.sys.secu.dao.model.SecuRole;
import com.ylsq.frame.sys.secu.dao.model.SecuRoleExample;
import com.ylsq.frame.sys.secu.dao.model.SecuUser;
import com.ylsq.frame.sys.secu.dao.model.SecuUserExample;
import com.ylsq.frame.sys.secu.dao.model.SecuUserRole;
import com.ylsq.frame.sys.secu.service.SecuRoleService;
import com.ylsq.frame.sys.secu.service.SecuUserRoleService;
import com.ylsq.frame.sys.secu.service.SecuUserService;

@RequestMapping("/sys/user/")
@Controller
public class SecuUserController extends BaseController {
	private static Logger log = LoggerFactory.getLogger(SecuUserController.class);
	
	@Autowired
	private SecuUserService secuUserService;
	@Autowired
	private SecuRoleService secuRoleService;
	@Autowired
	private SecuUserRoleService secuUserRoleService;
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(SecuUser user,ModelMap modelMap) {
		log.debug(user.toString());
		initModel(user);
		if(user.getId() == null) {
			secuUserService.insert(user);
		}
		else {
			secuUserService.updateByPrimaryKey(user);
		}
		return list(modelMap);
	}
	
	@RequestMapping(value="/configRoles/{userName}", method = RequestMethod.GET)
	public String configRoles(@PathVariable(name="userName")String userName, ModelMap modelMap) {
		SecuUser currentUser = secuUserService.selectByUsername(userName);
		List<SecuUserRole> mappingList = secuUserRoleService.selectByUserName(userName);
		Map<String,SecuUserRole> existingMap = new HashMap<>();
		for(SecuUserRole sur: mappingList)
			existingMap.put(sur.getRoleName(),sur);
		
		List<SecuRole> unselectedRoles = new ArrayList<>();
		List<SecuRole> selectedRoles = new ArrayList<>();
		List<SecuRole> allRoles = secuRoleService.selectByExample(new SecuRoleExample());
		for(SecuRole role: allRoles) {
			if(existingMap.keySet().contains(role.getRoleName())) {
				selectedRoles.add(role);
			}
			else {
				unselectedRoles.add(role);
			}
		}
		log.debug("size:" + mappingList.size());
		modelMap.put("selectedList", selectedRoles);
		modelMap.put("unselectedList", unselectedRoles);
		modelMap.put("user", currentUser);
		
		return webPrefix() + "/configRoles";
	}
	
	@RequestMapping(value="/configRoles", method = RequestMethod.POST)
	public String configRoles(@RequestParam(value="userName") String userName, @RequestParam(value="selectedIds") String selectedRoleIds, ModelMap modelMap) {
		log.debug(userName);
		List<SecuUserRole> mappingList = secuUserRoleService.selectByUserName(userName);
		Map<String,SecuUserRole> existingMap = new HashMap<>();
		for(SecuUserRole sur: mappingList)
			existingMap.put(sur.getRoleName(),sur);
		
		String[] idArray = StringUtils.defaultIfEmpty(selectedRoleIds, "").split("-");
		for(String roleName : idArray) {
			if(existingMap.keySet().contains(roleName)) {
				mappingList.remove(existingMap.get(roleName));
			}
			else {
				SecuUserRole sur = new SecuUserRole();
				sur.setRoleName(roleName);
				sur.setUserName(userName);
				initModel(sur);
				secuUserRoleService.insert(sur);
			}
		}
		for(SecuUserRole sur: mappingList) {
			secuUserRoleService.deleteByPrimaryKey(sur.getId());
		}
		return list(modelMap);
	}

	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return secuUserService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<SecuUser> list = secuUserService.selectByExample(new SecuUserExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/sys/secuUser/";
	}
}
