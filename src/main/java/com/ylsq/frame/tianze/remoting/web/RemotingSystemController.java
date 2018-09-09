package com.ylsq.frame.tianze.remoting.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ylsq.frame.tianze.base.RemotingResult;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptClientService;
import com.ylsq.frame.tianze.remoting.base.BaseRemotingController;

@RequestMapping("/remoting/sys/")
@Controller
public class RemotingSystemController extends BaseRemotingController{
	private Logger log = LoggerFactory.getLogger(RemotingSystemController.class);
	
	@Autowired
	private TzEncryptClientService clientService;
	
	@ResponseBody
	@RequestMapping(value="/checkUpdate", method=RequestMethod.GET)
	public RemotingResult checkUpdate(
			@RequestParam(required = false,name="userName") String userName, 
			@RequestParam(required = false,name="token") String token, 
			@RequestParam(required = false,name="clientVersion") String clientVersion) {
		if(verifyToken(userName, token)) {
			return new RemotingResult(token, clientService.getLatestVersion());
		}
		log.warn("not a valid token");
		return new RemotingResult();
	}
}
