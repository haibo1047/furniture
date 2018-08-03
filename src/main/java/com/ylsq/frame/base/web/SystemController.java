package com.ylsq.frame.base.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylsq.common.base.BaseController;

@RequestMapping("/sys/")
@Controller
public class SystemController extends BaseController {
	static private Logger log = LoggerFactory.getLogger(SystemController.class);
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		Subject subject = SecurityUtils.getSubject();
		return "/common/login";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(ModelMap modelMap) {
		Subject subject = SecurityUtils.getSubject();
		return "/common/login";
	}
}
