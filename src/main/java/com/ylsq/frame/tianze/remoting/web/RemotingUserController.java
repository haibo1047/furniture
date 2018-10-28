package com.ylsq.frame.tianze.remoting.web;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import com.ylsq.frame.sys.secu.dao.model.SecuUserRole;
import com.ylsq.frame.sys.secu.service.SecuUserRoleService;
import com.ylsq.frame.sys.secu.service.SecuUserService;
import com.ylsq.frame.tianze.base.RemotingResult;
import com.ylsq.frame.tianze.base.utils.TokenUtil;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminal;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptTerminalService;
import com.ylsq.frame.tianze.remoting.base.BaseRemotingController;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyEncrypt;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyOutgoing;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyRole;
import com.ylsq.frame.tianze.strategy.service.TzStrategyEncryptService;
import com.ylsq.frame.tianze.strategy.service.TzStrategyOutgoingService;
import com.ylsq.frame.tianze.strategy.service.TzStrategyRoleService;

@Controller
@RequestMapping("/remoting/user")
public class RemotingUserController extends BaseRemotingController{
	private Logger log = LoggerFactory.getLogger(RemotingUserController.class);
	
	@Autowired
	private SecuUserService secuUserService;
	@Autowired
	private TzEncryptTerminalService terminalService;
	@Autowired
	private SysLogService sysLogService;
	@Autowired
	private SecuUserRoleService secuUserRoleService;
	@Autowired
	private TzStrategyRoleService strategyRoleService;
	@Autowired
	private TzStrategyOutgoingService strategyOutgoingService;
	@Autowired
	private TzStrategyEncryptService strategyEncryptService;
	
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
		return RemotingResult.FA;
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
			return RemotingResult.SU;
		}
		return RemotingResult.FA;
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
		return RemotingResult.FA;
	}
	
	
	@ResponseBody
	@RequestMapping(value="/heartbeat", method = RequestMethod.GET)
	public RemotingResult heartbeat(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="token") String token) {
		if(verifyToken(userName, token) && terminalService.heartbeat(userName)){
			return RemotingResult.SU;
		}
		return RemotingResult.FA;
	}
	
	@ResponseBody
	@RequestMapping(value="/changepassword", method = RequestMethod.GET)
	public RemotingResult changepassword(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="oldPassword") String oldPassword, 
			@RequestParam(required = false,name="newPassword") String newPassword) {
		if(StringUtils.isBlank(newPassword) || StringUtils.isBlank(oldPassword))
			return RemotingResult.FA;
		SecuUser user = secuUserService.selectByUsername(userName);
		if(user != null && StringUtils.reverse(user.getPassword()).equals(oldPassword)) {
			SecuUser toBeUpdated = new SecuUser();
			toBeUpdated.setId(user.getId());
			toBeUpdated.setPassword(StringUtils.reverse(newPassword));
			secuUserService.updateByPrimaryKeySelective(toBeUpdated);
			return RemotingResult.SU;
		}
		return RemotingResult.FA;
	}
	
	@ResponseBody
	@RequestMapping(value="/getEncryptStrategyNames", method = RequestMethod.GET)
	public RemotingResult getEncryptStrategyNames(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="token") String token) {
		if(verifyToken(userName, token)) {
			Set<String> strategyNames = new HashSet<>();
			List<SecuUserRole> urList = secuUserRoleService.selectByUserName(userName);
			for(SecuUserRole sur: urList) {
				List<TzStrategyRole> mappingList = strategyRoleService.selectByRoleName(sur.getRoleName());
				for(TzStrategyRole map : mappingList) {
					if(TzStrategyEncrypt.Strategy_Type.equals(map.getStrategyType())) {
						strategyNames.add(map.getStrategyName());
					}
				}
			}
			return new RemotingResult(token, strategyNames);
		}
		return RemotingResult.FA;
	}

	@ResponseBody
	@RequestMapping(value="/getEncryptStrategy", method = RequestMethod.GET)
	public RemotingResult getEncryptStrategy(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="token") String token, 
			@RequestParam(required = false,name="strategyName") String strategyName) {
		if(verifyToken(userName, token) && !StringUtils.isBlank(strategyName)) {
			TzStrategyEncrypt strategy = strategyEncryptService.selectByName(strategyName);
			return new RemotingResult(token, strategy);
		}
		return RemotingResult.FA;
	}
	
	@ResponseBody
	@RequestMapping(value="/getOutgoingStrategyNames", method = RequestMethod.GET)
	public RemotingResult getOutgoingStrategyNames(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="token") String token) {
		if(verifyToken(userName, token)) {
			Set<String> strategyNames = new HashSet<>();
			List<SecuUserRole> urList = secuUserRoleService.selectByUserName(userName);
			for(SecuUserRole sur: urList) {
				List<TzStrategyRole> mappingList = strategyRoleService.selectByRoleName(sur.getRoleName());
				for(TzStrategyRole map : mappingList) {
					if(TzStrategyOutgoing.Strategy_Type.equals(map.getStrategyType())) {
						strategyNames.add(map.getStrategyName());
					}
				}
			}
			return new RemotingResult(token, strategyNames);
		}
		return RemotingResult.FA;
	}
	
	
	@ResponseBody
	@RequestMapping(value="/getOutgoingStrategy", method = RequestMethod.GET)
	public RemotingResult getOutgoingStrategy(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="token") String token, 
			@RequestParam(required = false,name="strategyName") String strategyName) {
		if(verifyToken(userName, token) && !StringUtils.isBlank(strategyName)) {
			TzStrategyOutgoing strategy = strategyOutgoingService.selectByStrategyName(strategyName);
			return new RemotingResult(token, strategy);
		}
		return RemotingResult.FA;
	}
}
