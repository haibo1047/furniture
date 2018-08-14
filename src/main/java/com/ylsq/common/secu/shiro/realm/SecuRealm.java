package com.ylsq.common.secu.shiro.realm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ylsq.common.base.SysParamEnum;
import com.ylsq.common.base.SystemConstants;
import com.ylsq.frame.base.dao.model.SecuMenu;
import com.ylsq.frame.base.dao.model.SecuMenuExample;
import com.ylsq.frame.base.dao.model.SecuUser;
import com.ylsq.frame.base.obj.MenuObject;
import com.ylsq.frame.base.service.SecuMenuService;
import com.ylsq.frame.base.service.SecuUserService;
import com.ylsq.frame.base.sorter.MenuSorter;
import com.ylsq.frame.sys.dao.model.SysParamValue;
import com.ylsq.frame.sys.service.SysParamValueService;

public class SecuRealm extends AuthenticatingRealm {
	private static Logger log = LoggerFactory.getLogger(SecuRealm.class);
	
	@Autowired
	private SecuUserService secuUserService;
	@Autowired
	private SecuMenuService secuMenuService;
	@Autowired
	private SysParamValueService sysParamValueService;
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		String userName = (String)token.getPrincipal();
		String passwd = new String((char[])token.getCredentials());
		SecuUser secuUser = secuUserService.selectByUsername(userName);
		if(secuUser == null) {
			throw new UnknownAccountException();
		}
		if(!passwd.equals(secuUser.getPassword())) {
			log.error("login failed");
			throw new IncorrectCredentialsException();
		}
		List<SysParamValue> moduleList = sysParamValueService.selectByParamName(SysParamEnum.Menu_Module.getConstant());
		Map<String,Integer> moduleMap = new HashMap<>();
		for(SysParamValue m : moduleList)
			moduleMap.put(m.getValue1(), Integer.parseInt(m.getValue2()));
		List<SecuMenu> menuList = secuMenuService.selectByExample(new SecuMenuExample());
		List<MenuObject> mList = new ArrayList<>(menuList.size());
		for(SecuMenu m : menuList) {
			MenuObject sm = new MenuObject(m);
			sm.setModuleOrder(moduleMap.get(m.getMenuModule()));
			mList.add(sm);
		}
		Collections.sort(mList, new MenuSorter());
		Map<String,List<MenuObject>> menuMap = new LinkedHashMap<>();
		for(MenuObject sm : mList) {
			List<MenuObject> subList = menuMap.get(sm.getModule());
			if(subList == null) {
				menuMap.put(sm.getModule(), new ArrayList<MenuObject>());
			}
			menuMap.get(sm.getModule()).add(sm);
		}
		SecurityUtils.getSubject().getSession().setAttribute(SystemConstants.System_Menu_Key, menuMap);
		SecurityUtils.getSubject().getSession().setAttribute(SystemConstants.System_Login, userName);
		
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userName, passwd, getName());
		return info;
	}

}
