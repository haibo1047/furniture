package com.ylsq.frame.tianze.remoting.web;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ylsq.frame.sys.base.service.SysLogService;
import com.ylsq.frame.sys.secu.dao.model.SecuUser;
import com.ylsq.frame.sys.secu.service.SecuUserService;
import com.ylsq.frame.tianze.base.RemotingResult;
import com.ylsq.frame.tianze.base.utils.TokenUtil;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminal;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptTerminalService;

@Controller
@RequestMapping("/remoting/user")
public class RemoteUserController {
	private Logger log = LoggerFactory.getLogger(RemoteUserController.class);
	
	@Autowired
	private SecuUserService secuUserService;
	@Autowired
	private TzEncryptTerminalService terminalService;
	@Autowired
	private SysLogService sysLogService;
	
	@ResponseBody
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public RemotingResult login(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="password") String password, 
			@RequestParam(required = false,name="clientno") String clientno) {
		if(StringUtils.isNotBlank(userName)&&StringUtils.isNotBlank(password)&&StringUtils.isNotBlank(clientno)) {
			SecuUser user = secuUserService.selectByUsername(userName);
			if(user != null && StringUtils.reverse(password).equals(user.getPassword())){
				TzEncryptTerminal record = new TzEncryptTerminal();
				record.setLoginId(userName);
				terminalService.online(record);
				sysLogService.doLogin(userName, new Date(), null, "remoting login");
				return new RemotingResult(TokenUtil.buildToken(userName));
			}
		}
		log.warn("remote user login failed-" + userName);
		return new RemotingResult();
		
	}
	
	private boolean verifyToken(String userName,String token) {
		if(StringUtils.isNotBlank(userName) && StringUtils.isNotBlank(token)) {
			if(token.equals(TokenUtil.buildToken(userName)))
				return true;
		}
		return false;
	}
	@ResponseBody
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public RemotingResult logout(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="token") String token) {
		if(verifyToken(userName, token)) {
			TzEncryptTerminal terminal = new TzEncryptTerminal();
			terminal.setLoginId(userName);
			terminalService.offline(terminal);
			sysLogService.doLogout(userName, new Date(), null, "remoting logout");
			return new RemotingResult(1);
		}
		return new RemotingResult();
	}
	
	@ResponseBody
	@RequestMapping(value="/getuserinfo", method = RequestMethod.GET)
	public RemotingResult getUserInfo(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="token") String token) {
		if(verifyToken(userName, token)) {
			SecuUser user = secuUserService.selectByUsername(userName);
			return new RemotingResult(token, user);
		}
		return new RemotingResult();
	}
	
	
	@ResponseBody
	@RequestMapping(value="/heartbeat", method = RequestMethod.GET)
	public RemotingResult heartbeat(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="token") String token) {
		if(verifyToken(userName, token) && terminalService.heartbeat(userName)){
			return new RemotingResult(1);
		}
		return new RemotingResult();
	}
	
	@ResponseBody
	@RequestMapping(value="/changepassword", method = RequestMethod.GET)
	public RemotingResult changepassword(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="oldPassword") String oldPassword, 
			@RequestParam(required = false,name="newPassword") String newPassword) {
		if(StringUtils.isBlank(newPassword) || StringUtils.isBlank(oldPassword))
			return new RemotingResult();
		SecuUser user = secuUserService.selectByUsername(userName);
		if(user != null && StringUtils.reverse(user.getPassword()).equals(oldPassword)) {
			SecuUser toBeUpdated = new SecuUser();
			toBeUpdated.setId(user.getId());
			toBeUpdated.setPassword(StringUtils.reverse(newPassword));
			secuUserService.updateByPrimaryKeySelective(toBeUpdated);
		}
		return new RemotingResult();
	}
}
