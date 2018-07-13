package com.ylsq.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylsq.common.base.BaseController;

@RequestMapping("/home")
@Controller
public class IndexController extends BaseController {

	@RequestMapping(value= "/index", method = RequestMethod.GET)
	public String index() {
		return "/home/index";
	}
}
