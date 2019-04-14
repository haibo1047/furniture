package com.ylsq.frame.tianze.remoting.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ylsq.frame.tianze.base.RemotingResult;
import com.ylsq.frame.tianze.base.service.TzBaseFeedbackService;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptClientService;
import com.ylsq.frame.tianze.remoting.base.BaseRemotingController;
import com.ylsq.frame.tianze.remoting.tranfer.UserFeedback;

@RequestMapping("/remoting/sys/")
@Controller
public class RemotingSystemController extends BaseRemotingController{
	private Logger log = LoggerFactory.getLogger(RemotingSystemController.class);
	
	@Autowired
	private TzEncryptClientService clientService;
	@Autowired
	private TzBaseFeedbackService feedbackService;
	
	@ResponseBody
	@RequestMapping(value="/checkUpdate", method=RequestMethod.GET)
	public RemotingResult checkUpdate() {
			return new RemotingResult(null, clientService.getLatestVersion());
	}
	
	@ResponseBody
	@RequestMapping(value="/feedback", method=RequestMethod.POST)
	public RemotingResult feedback(@RequestBody UserFeedback feedback) {
		if(verifyToken(feedback.getUserName(), feedback.getToken())) {
			feedbackService.initFeedback(feedback.getUserName(), feedback.getFeedback());
			return RemotingResult.SU;
		}
		log.warn("not a valid token");
		return RemotingResult.FA;
	}
}
