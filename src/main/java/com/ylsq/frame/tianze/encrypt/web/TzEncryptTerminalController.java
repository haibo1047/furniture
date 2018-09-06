package com.ylsq.frame.tianze.encrypt.web;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ylsq.frame.common.base.BaseController;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminalExample;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptTerminalService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/tz/terminal")
public class TzEncryptTerminalController extends BaseController{
    private static final Logger log = LoggerFactory.getLogger(TzEncryptTerminalController.class);
	
	@Autowired
	private TzEncryptTerminalService tzEncryptTerminalService;
	
	@RequestMapping("/list")
	public String list(@RequestParam(required = false, defaultValue = "1", value = "pageNum")int pageNum, ModelMap modelMap) {
		// TODO Auto-generated method stub
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		modelMap.put("modelList", tzEncryptTerminalService.selectByExampleForStartPage(new TzEncryptTerminalExample(), pageNum, pageSize));
		modelMap.put("total", tzEncryptTerminalService.countByExample(new TzEncryptTerminalExample()));
		modelMap.put("statusList", getParams("terminal_status"));
		return webPrefix() + "list";
	}


	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/tz/terminal/";
	}
}