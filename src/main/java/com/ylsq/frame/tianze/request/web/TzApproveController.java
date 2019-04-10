package com.ylsq.frame.tianze.request.web;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ylsq.frame.common.base.BaseController;
import com.ylsq.frame.common.base.SysParamEnum;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoing;
import com.ylsq.frame.tianze.request.service.TzRequestOutgoingService;

/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/tz/approval")
public class TzApproveController extends BaseController {
	private static final Logger log = LoggerFactory.getLogger(TzApproveController.class);
	
	@Autowired
	private TzRequestOutgoingService tzRequestOutgoingService;
	 
	@RequestMapping(value= "/outgoing", method = RequestMethod.GET)
	public String outgoing(@RequestParam(required = false, defaultValue = "1", value = "pageNum") int pageNum,ModelMap modelMap) {
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		List<TzRequestOutgoing> list = tzRequestOutgoingService.selectMyPendingForStartPage(currentLogin(), pageNum, pageSize);
		modelMap.put("modelList", list);
		modelMap.put("total", tzRequestOutgoingService.countAllMyPending(currentLogin()));
		modelMap.put("statusList", getParams(SysParamEnum.Request_Approve_Status.getConstant()));
		return webPrefix() + "list";
	 }
	 
	private String outgoing(ModelMap modelMap) {
		return outgoing(1, modelMap);
	}
	 
	 @RequestMapping(value= "/pass/{id}", method = RequestMethod.GET)
	 public String approve(@PathVariable(name="id") String id,ModelMap modelMap) {
		 log.debug(id);
		 int result = tzRequestOutgoingService.approve(currentLogin(), Long.parseLong(id));
		 if(result <= 0) {
			 modelMap.put("errorMsg", "审批操作失败！");
		 }
		 return outgoing(modelMap);
		 
	 }
	 
	 @RequestMapping(value= "/reject/{id}", method = RequestMethod.GET)
	 public String reject(@PathVariable(name="id") String id,ModelMap modelMap) {
		 log.debug(id);
		 int result = tzRequestOutgoingService.reject(currentLogin(), Long.parseLong(id));
		 if(result <= 0) {
			 modelMap.put("errorMsg", "审批操作失败！");
		 }
		 return outgoing(modelMap);
		 
	 }

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/tz/approval/";
	}
}
