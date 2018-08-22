package com.ylsq.frame.tianze.encrypt.web;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylsq.frame.common.base.BaseController;
import com.ylsq.frame.common.base.BaseExample;
import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminal;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminalExample;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptTerminalService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/tz/terminal")
public class TzEncryptTerminalController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(TzEncryptTerminalController.class);
	
	@Autowired
	private TzEncryptTerminalService tzEncryptTerminalService;
	
	@Override
	protected void beforeList(ModelMap modelMap) {
		// TODO Auto-generated method stub
		modelMap.put("statusList", getParams("terminal_status"));
	}

	@Override
	protected void beforeEdit(ModelMap modelMap) {
		// TODO Auto-generated method stub
		modelMap.put("statusList", getParams("terminal_status"));
		super.beforeEdit(modelMap);
	}

	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(TzEncryptTerminal tzEncryptTerminal,ModelMap modelMap) {
		log.debug(tzEncryptTerminal.toString());
		initModel(tzEncryptTerminal);
		if(tzEncryptTerminal.getId() == null) {
			tzEncryptTerminal.setLoginId(currentLogin());
			tzEncryptTerminal.setLastLoginTime(new Date());
			tzEncryptTerminalService.insert(tzEncryptTerminal);
		}
		else {
			tzEncryptTerminalService.updateByPrimaryKey(tzEncryptTerminal);
		}
		return list(modelMap);
	}
	
	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return tzEncryptTerminalService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<TzEncryptTerminal> list = tzEncryptTerminalService.selectByExample(new TzEncryptTerminalExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/tz/terminal/";
	}
}