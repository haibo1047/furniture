package com.ylsq.frame.tianze.remoting.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ylsq.frame.common.base.BaseController;

@Controller
@RequestMapping("/remoting/user")
public class RemoteUserController extends BaseController {

	@ResponseBody
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "abc";
	}
	
	@ResponseBody
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout() {
		return "abc";
	}
}
