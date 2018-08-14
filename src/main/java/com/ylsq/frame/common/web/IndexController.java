package com.ylsq.frame.common.web;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylsq.frame.common.base.BaseController;

@RequestMapping("/home")
@Controller
public class IndexController extends BaseController {
	private static Logger log = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping(value= "/index", method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		log.debug((String)SecurityUtils.getSubject().getPrincipal());
		return "/home/index";
	}
}
