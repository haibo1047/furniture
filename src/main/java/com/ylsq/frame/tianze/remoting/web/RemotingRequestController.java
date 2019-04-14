
package com.ylsq.frame.tianze.remoting.web;
import java.util.Collections;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ylsq.frame.sys.base.service.SysBlobService;
import com.ylsq.frame.tianze.base.RemotingResult;
import com.ylsq.frame.tianze.remoting.base.BaseRemotingController;
import com.ylsq.frame.tianze.remoting.tranfer.OutgoingRequest;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoing;
import com.ylsq.frame.tianze.request.service.TzRequestOutgoingService;

@RequestMapping("/remoting/tz/request/")
@Controller
public class RemotingRequestController extends BaseRemotingController {
	private static Logger log = LoggerFactory.getLogger(RemotingRequestController.class);
	
	@Autowired
	private TzRequestOutgoingService requestOutgoingService;
	@Autowired
	private SysBlobService sysBlobService;
	
	@ResponseBody
	@RequestMapping(value="/outgoing", method=RequestMethod.POST)
	public RemotingResult outgoing(@RequestBody OutgoingRequest outgoing) {
		if(verifyToken(outgoing.getUserName(), outgoing.getToken())) {
			TzRequestOutgoing tzOutgoing = outgoing.convert();
			tzOutgoing.setFileId(0l);
			requestOutgoingService.insert(tzOutgoing);
			
			if(outgoing.getFileData() != null) {
				Long fileId = sysBlobService.insert(outgoing.getFileData(), tzOutgoing.getId());
				outgoing.setFileId(fileId);
			}
			return RemotingResult.SU;
		}
		log.warn("not a valid token");
		return RemotingResult.FA;
	}
	
	@ResponseBody
	@RequestMapping(value="/mine", method=RequestMethod.GET)
	public RemotingResult mine(@RequestParam(required = true,name="userName") String userName, 
			@RequestParam(required = true,name="token") String token) {
		if(verifyToken(userName, token)) {
			return new RemotingResult(token, requestOutgoingService.selectMine(userName));
		}
		log.warn("not a valid token");
		return RemotingResult.FA;
	}
	
	@ResponseBody
	@RequestMapping(value="/getInfo", method=RequestMethod.GET)
	public RemotingResult getInfo(@RequestParam(required = true,name="userName") String userName, 
			@RequestParam(required = true,name="token") String token,
			@RequestParam(required = true, name = "requestId") Long requestId) {
		if(verifyToken(userName, token)) {
			return new RemotingResult(token, requestOutgoingService.getInfo(requestId));
		}
		log.warn("not a valid token");
		return RemotingResult.FA;
	}
	
	
	@ResponseBody
	@RequestMapping(value="/pending", method=RequestMethod.GET)
	public RemotingResult pending(@RequestParam(required = true,name="userName") String userName, 
			@RequestParam(required = true,name="token") String token) {
		if(verifyToken(userName, token)) {
			if(SecurityUtils.getSubject().hasRole("外发审批人")) {
				return new RemotingResult(token, requestOutgoingService.selectMyPending(userName));
			}
			return new RemotingResult(token, Collections.EMPTY_LIST);
		}
		log.warn("not a valid token");
		return RemotingResult.FA;
	}
	
	@ResponseBody
	@RequestMapping(value="/approve", method=RequestMethod.GET)
	public RemotingResult approve(@RequestParam(required = true,name="userName") String userName, 
			@RequestParam(required = true,name="token") String token,
			@RequestParam(required = true, name = "requestId") Long requestId) {
		if(verifyToken(userName, token)) {
			if(SecurityUtils.getSubject().hasRole("外发审批人")) {
				return new RemotingResult(token, requestOutgoingService.approve(userName, requestId));
			}
			else {
				log.warn("非审批人员"+ userName + "尝试审批外发申请");
				return RemotingResult.SU;
			}
		}
		log.warn("not a valid token");
		return RemotingResult.FA;
	}
	
	@ResponseBody
	@RequestMapping(value="/reject", method=RequestMethod.GET)
	public RemotingResult reject(@RequestParam(required = true,name="userName") String userName, 
			@RequestParam(required = true,name="token") String token,
			@RequestParam(required = true, name = "requestId") Long requestId) {
		if(verifyToken(userName, token)) {
			if(SecurityUtils.getSubject().hasRole("外发审批人")) {
				return new RemotingResult(token, requestOutgoingService.reject(userName, requestId));
			}
			else {
				log.warn("非审批人员"+ userName + "尝试审批外发申请");
				return RemotingResult.SU;
			}
		}
		log.warn("not a valid token");
		return RemotingResult.FA;
	}
}
