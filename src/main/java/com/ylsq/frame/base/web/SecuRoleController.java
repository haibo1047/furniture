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


@Controller
@RequestMapping("/sys/role")
public class SecuRoleController extends BaseController {
	private static Logger log = LoggerFactory.getLogger(SecuRoleController.class);
	public static String WEB_PREFIX = "/sys/secuRole/";
	
	@Autowired
	private SecuRoleService secuRoleService;
	@Autowired
	private SecuUserService secuUserService;
	@Autowired
	private SecuUserRoleService secuUserRoleService;
	
	@RequestMapping(value= "/list", method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		List<SecuRole> list = secuRoleService.selectByExample(new SecuRoleExample());
		modelMap.put("roleList", list);
		return WEB_PREFIX+"roleList";
	}
	
	@RequestMapping(value= "/create", method = RequestMethod.GET)
	public String create() {
		return WEB_PREFIX+"editRole";
	}
	
	@RequestMapping(value= "/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable(name="id") String id,ModelMap modelMap) {
		log.debug(id);
		SecuRole secuRole = secuRoleService.selectByPrimaryKey(Long.parseLong(id));
		modelMap.put("role", secuRole);
		return WEB_PREFIX+"editRole";
	}
	
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
	
	@RequestMapping(value= "/delete/{ids}", method = RequestMethod.GET)
	public String delete(@PathVariable(name="ids") String ids,ModelMap modelMap) {
		int cnt = secuRoleService.deleteByPrimaryKeys(ids);
		log.debug(cnt + ":" + ids);
		return list(modelMap);
	}
	
	@RequestMapping(value="/configUsers/{id}", method = RequestMethod.GET)
	public String configUsers(@PathVariable(name="id") String roleId, ModelMap modelMap) {
		if(!StringUtils.isNumeric(roleId)) {
		}
		Long theRoleId = Long.parseLong(roleId);
		SecuRole currentRole = secuRoleService.selectByPrimaryKey(theRoleId);
		SecuUserRoleExample example = new SecuUserRoleExample();
		example.createCriteria().andRoleIdEqualTo(Long.parseLong(roleId));
		List<SecuUserRole> mappingList = secuUserRoleService.selectByExample(example);
		List<Long> selectedUserIds = new ArrayList<Long>();
		for(SecuUserRole sur: mappingList)
			selectedUserIds.add(sur.getUserId());
		
		List<SecuUser> unselectedUsers = new ArrayList<>();
		List<SecuUser> selectedUsers = new ArrayList<>();
		List<SecuUser> allUsers = secuUserService.selectByExample(new SecuUserExample());
		for(SecuUser user: allUsers) {
			if(selectedUserIds.contains(user.getId())) {
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
		
		return WEB_PREFIX + "/configUsers";
	}
	
	
	@RequestMapping(value="/configUsers", method = RequestMethod.POST)
	public String configUsers(@RequestParam(value="roleId") String roleId, @RequestParam(value="selectedIds") String selectedUserIds, ModelMap modelMap) {
		log.debug(roleId);
		SecuUserRoleExample example = new SecuUserRoleExample();
		example.createCriteria().andRoleIdEqualTo(Long.parseLong(roleId));
		List<SecuUserRole> mappingList = secuUserRoleService.selectByExample(example);
		Map<Long,SecuUserRole> existingMap = new HashMap<>();
		for(SecuUserRole sur: mappingList)
			existingMap.put(sur.getUserId(),sur);
		
		String[] idArray = StringUtils.defaultIfEmpty(selectedUserIds, "").split("-");
		for(String userId : idArray) {
			Long uid = Long.parseLong(userId);
			if(existingMap.keySet().contains(uid)) {
				mappingList.remove(existingMap.get(uid));
			}
			else {
				SecuUserRole sur = new SecuUserRole();
				sur.setRoleId(Long.parseLong(roleId));
				sur.setUserId(uid);
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