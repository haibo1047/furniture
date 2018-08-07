package com.ylsq.frame.base.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylsq.common.base.BaseController;
import com.ylsq.common.base.BaseModel;
import com.ylsq.common.base.BaseService;
import com.ylsq.frame.base.dao.model.SecuMenu;
import com.ylsq.frame.base.dao.model.SecuMenuExample;
import com.ylsq.frame.base.service.SecuMenuService;

@Controller
@RequestMapping("/sys/menu/")
public class SecuMenuController extends BaseController {
	private static Logger log = LoggerFactory.getLogger(SecuMenuController.class);
	public static String WEB_PREFIX = "/sys/secuMenu/";
	
	@Autowired
	private SecuMenuService secuMenuService;
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(SecuMenu menu,ModelMap modelMap) {
		log.debug(menu.toString());
		initModel(menu);
		if(menu.getId() == null) {
			secuMenuService.insert(menu);
		}
		else {
			secuMenuService.updateByPrimaryKey(menu);
		}
		return list(modelMap);
	}


	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<SecuMenu> menuList = secuMenuService.selectByExample(new SecuMenuExample());
		return menuList;
	}

	@Override
	protected BaseService<SecuMenu,SecuMenuExample> getService() {
		// TODO Auto-generated method stub
		return secuMenuService;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/sys/secuMenu/";
	}

}
