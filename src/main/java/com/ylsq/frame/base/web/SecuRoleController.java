package com.ylsq.frame.base.web;

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

import com.ylsq.common.base.BaseController;
import com.ylsq.common.base.BaseExample;
import com.ylsq.common.base.BaseModel;
import com.ylsq.common.base.BaseService;
import com.ylsq.frame.base.dao.model.SecuMenu;
import com.ylsq.frame.base.dao.model.SecuMenuExample;
import com.ylsq.frame.base.dao.model.SecuRole;
import com.ylsq.frame.base.dao.model.SecuRoleExample;
import com.ylsq.frame.base.dao.model.SecuRoleMenu;
import com.ylsq.frame.base.dao.model.SecuUser;
import com.ylsq.frame.base.dao.model.SecuUserExample;
import com.ylsq.frame.base.dao.model.SecuUserRole;
import com.ylsq.frame.base.service.SecuMenuService;
import com.ylsq.frame.base.service.SecuRoleMenuService;
import com.ylsq.frame.base.service.SecuRoleService;
import com.ylsq.frame.base.service.SecuUserRoleService;
import com.ylsq.frame.base.service.SecuUserService;


@Controller
@RequestMapping("/sys/role")
public class SecuRoleController extends BaseController {
	private static Logger log = LoggerFactory.getLogger(SecuRoleController.class);
	
	@Autowired
	private SecuRoleService secuRoleService;
	@Autowired
	private SecuUserService secuUserService;
	@Autowired
	private SecuUserRoleService secuUserRoleService;
	
	@Autowired
	private SecuMenuService secuMenuService;
	@Autowired
	private SecuRoleMenuService secuRoleMenuService;
	
	
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(SecuRole role,ModelMap modelMap) {
		log.debug(role.toString());
		initModel(role);
		if(role.getId() == null) {
			secuRoleService.insert(role);
		}
		else {
			secuRoleService.updateByPrimaryKey(role);
		}
		return list(modelMap);
	}
	
	@RequestMapping(value="/configMenus/{roleName}", method = RequestMethod.GET)
	public String configMenus(@PathVariable(name="roleName") String roleName, ModelMap modelMap) {
		SecuRole currentRole = secuRoleService.selectByRoleName(roleName);
		List<SecuRoleMenu> mappingList = secuRoleMenuService.selectByRoleName(roleName);
		List<String> names = new ArrayList<>();
		for(SecuRoleMenu srm: mappingList)
			names.add("'" + srm.getMenuName() +"'");
		String selectedMenuNames = String.join(",", names);
		List<SecuMenu> allMenus = secuMenuService.selectByExample(new SecuMenuExample());
		log.debug("size:" + mappingList.size());
		modelMap.put("selectedMenuNames", "["+selectedMenuNames+"]");
		modelMap.put("allMenus", allMenus);
		modelMap.put("role", currentRole);
		return webPrefix() + "/configMenus";
	}
	
	@RequestMapping(value="/configMenus", method = RequestMethod.POST)
	public String configMenus(@RequestParam(name="roleName") String roleName,@RequestParam(value="selectedIds") String selectedMenuIds, ModelMap modelMap) {
		log.debug(roleName);
		Map<String,SecuRoleMenu> existingMap = new HashMap<>();
		List<SecuRoleMenu> mappingList = secuRoleMenuService.selectByRoleName(roleName);
		for(SecuRoleMenu srm: mappingList)
			existingMap.put(srm.getRoleName(), srm);
		
		String[] idArray = StringUtils.defaultIfEmpty(selectedMenuIds, "").split(",");
		for(String menuName : idArray) {
			if(existingMap.keySet().contains(menuName)) {
				mappingList.remove(existingMap.get(menuName));
			}
			else {
				SecuRoleMenu srm = new SecuRoleMenu();
				srm.setRoleName(roleName);
				srm.setMenuName(menuName);
				initModel(srm);
				secuRoleMenuService.insert(srm);
			}
		}
		for(SecuRoleMenu srm: mappingList) {
			secuRoleMenuService.deleteByPrimaryKey(srm.getId());
		}
		
		return list(modelMap);
	}
	
	
	@RequestMapping(value="/configUsers/{roleName}", method = RequestMethod.GET)
	public String configUsers(@PathVariable(name="roleName") String roleName, ModelMap modelMap) {
		SecuRole currentRole = secuRoleService.selectByRoleName(roleName);
		List<SecuUserRole> mappingList = secuUserRoleService.selectByRoleName(roleName);
		List<String> selectedUserNames = new ArrayList<String>();
		for(SecuUserRole sur: mappingList)
			selectedUserNames.add(sur.getUserName());
		
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
		modelMap.put("role", currentRole);
		
		return webPrefix() + "/configUsers";
	}
	
	
	@RequestMapping(value="/configUsers", method = RequestMethod.POST)
	public String configUsers(@RequestParam(value="roleName") String roleName, @RequestParam(value="selectedIds") String selectedUserNames, ModelMap modelMap) {
		log.debug(roleName);
		List<SecuUserRole> mappingList = secuUserRoleService.selectByRoleName(roleName);
		Map<String,SecuUserRole> existingMap = new HashMap<>();
		for(SecuUserRole sur: mappingList)
			existingMap.put(sur.getUserName(),sur);
		
		String[] idArray = StringUtils.defaultIfEmpty(selectedUserNames, "").split("-");
		for(String userName : idArray) {
			if(existingMap.keySet().contains(userName)) {
				mappingList.remove(existingMap.get(userName));
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
		return secuRoleService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<SecuRole> list = secuRoleService.selectByExample(new SecuRoleExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/sys/secuRole/";
	}
}
