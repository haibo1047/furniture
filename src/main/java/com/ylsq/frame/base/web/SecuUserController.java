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
import com.ylsq.frame.base.dao.model.SecuRole;
import com.ylsq.frame.base.dao.model.SecuRoleExample;
import com.ylsq.frame.base.dao.model.SecuUser;
import com.ylsq.frame.base.dao.model.SecuUserExample;
import com.ylsq.frame.base.dao.model.SecuUserRole;
import com.ylsq.frame.base.dao.model.SecuUserRoleExample;
import com.ylsq.frame.base.service.SecuRoleService;
import com.ylsq.frame.base.service.SecuUserRoleService;
import com.ylsq.frame.base.service.SecuUserService;

@RequestMapping("/sys/user/")
@Controller
public class SecuUserController extends BaseController {
	private static Logger log = LoggerFactory.getLogger(SecuUserController.class);
	private static String WEB_PREFIX = "/sys/secuUser";
	
	@Autowired
	private SecuUserService secuUserService;
	@Autowired
	private SecuRoleService secuRoleService;
	@Autowired
	private SecuUserRoleService secuUserRoleService;
	
	@RequestMapping(value= "/list", method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		List<SecuUser> list = secuUserService.selectByExample(new SecuUserExample());
		modelMap.put("userList", list);
		return "/sys/secuUser/userList";
	}
	
	@RequestMapping(value= "/create", method = RequestMethod.GET)
	public String create() {
		return "/sys/secuUser/editUser";
	}
	
	@RequestMapping(value= "/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable(name="id") String id,ModelMap modelMap) {
		log.debug(id);
		SecuUser secuUser = secuUserService.selectByPrimaryKey(Long.parseLong(id));
		modelMap.put("user", secuUser);
		return "/sys/secuUser/editUser";
	}
	
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
	
	@RequestMapping(value= "/delete/{ids}", method = RequestMethod.GET)
	public String delete(@PathVariable(name="ids") String ids,ModelMap modelMap) {
		int cnt = secuUserService.deleteByPrimaryKeys(ids);
		log.debug(cnt + ":" + ids);
		return list(modelMap);
	}
	
	@RequestMapping(value="/configRoles/{id}", method = RequestMethod.GET)
	public String configRoles(@PathVariable(name="id")String userId, ModelMap modelMap) {
		if(!StringUtils.isNumeric(userId)) {
		}
		Long theUserId = Long.parseLong(userId);
		SecuUser currentUser = secuUserService.selectByPrimaryKey(theUserId);
		SecuUserRoleExample example = new SecuUserRoleExample();
		example.createCriteria().andUserIdEqualTo(theUserId);
		List<SecuUserRole> mappingList = secuUserRoleService.selectByExample(example);
		Map<Long,SecuUserRole> existingMap = new HashMap<>();
		for(SecuUserRole sur: mappingList)
			existingMap.put(sur.getRoleId(),sur);
		
		List<SecuRole> unselectedRoles = new ArrayList<>();
		List<SecuRole> selectedRoles = new ArrayList<>();
		List<SecuRole> allRoles = secuRoleService.selectByExample(new SecuRoleExample());
		for(SecuRole role: allRoles) {
			if(existingMap.keySet().contains(role.getId())) {
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
		
		return WEB_PREFIX + "/configRoles";
	}
	
	@RequestMapping(value="/configRoles", method = RequestMethod.POST)
	public String configUsers(@RequestParam(value="userId") String userId, @RequestParam(value="selectedIds") String selectedRoleIds, ModelMap modelMap) {
		log.debug(userId);
		SecuUserRoleExample example = new SecuUserRoleExample();
		example.createCriteria().andUserIdEqualTo(Long.parseLong(userId));
		List<SecuUserRole> mappingList = secuUserRoleService.selectByExample(example);
		Map<Long,SecuUserRole> existingMap = new HashMap<>();
		for(SecuUserRole sur: mappingList)
			existingMap.put(sur.getUserId(),sur);
		
		String[] idArray = StringUtils.defaultIfEmpty(selectedRoleIds, "").split("-");
		for(String roleId : idArray) {
			Long rid = Long.parseLong(roleId);
			if(existingMap.keySet().contains(rid)) {
				mappingList.remove(existingMap.get(rid));
			}
			else {
				SecuUserRole sur = new SecuUserRole();
				sur.setRoleId(rid);
				sur.setUserId(Long.parseLong(userId));
				initModel(sur);
				secuUserRoleService.insert(sur);
			}
		}
		for(SecuUserRole sur: mappingList) {
			secuUserRoleService.deleteByPrimaryKey(sur.getId());
		}
		return list(modelMap);
	}
}