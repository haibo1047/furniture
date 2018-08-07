package com.ylsq.common.secu.shiro.realm;

import java.util.List;

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

import com.ylsq.common.base.SystemConstants;
import com.ylsq.frame.base.dao.model.SecuMenu;
import com.ylsq.frame.base.dao.model.SecuMenuExample;
import com.ylsq.frame.base.dao.model.SecuUser;
import com.ylsq.frame.base.service.SecuMenuService;
import com.ylsq.frame.base.service.SecuUserService;

public class SecuRealm extends AuthenticatingRealm {
	private static Logger log = LoggerFactory.getLogger(SecuRealm.class);
	
	@Autowired
	private SecuUserService secuUserService;
	@Autowired
	private SecuMenuService secuMenuService;
	
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
		List<SecuMenu> menuList = secuMenuService.selectByExample(new SecuMenuExample());
		SecurityUtils.getSubject().getSession().setAttribute(SystemConstants.System_Menu_Key, menuList);
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userName, passwd, getName());
		return info;
	}

}
