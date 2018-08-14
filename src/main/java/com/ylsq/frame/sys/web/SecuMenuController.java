package com.ylsq.frame.sys.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylsq.frame.common.base.BaseController;
import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.common.base.SysParamEnum;
import com.ylsq.frame.sys.dao.model.SecuMenu;
import com.ylsq.frame.sys.dao.model.SecuMenuExample;
import com.ylsq.frame.sys.service.SecuMenuService;

@Controller
@RequestMapping("/sys/menu/")
public class SecuMenuController extends BaseController {
	private static Logger log = LoggerFactory.getLogger(SecuMenuController.class);
	
	@Autowired
	private SecuMenuService secuMenuService;
	
	
	
	@Override
	public String list(ModelMap modelMap) {
		// TODO Auto-generated method stub
		modelMap.put("moduleList", getParams(SysParamEnum.Menu_Module.getConstant()));
		return super.list(modelMap);
	}


	@Override
	protected void beforeEdit(ModelMap modelMap) {
		// TODO Auto-generated method stub
		modelMap.put("moduleList", getParams(SysParamEnum.Menu_Module.getConstant()));
		super.beforeEdit(modelMap);
	}

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
