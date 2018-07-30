package com.ylsq.frame.base.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylsq.common.base.BaseController;
import com.ylsq.frame.base.dao.model.SecuUser;
import com.ylsq.frame.base.dao.model.SecuUserExample;
import com.ylsq.frame.base.service.SecuUserService;

@RequestMapping("/sys/user/")
@Controller
public class SecuUserController extends BaseController {
	private static Logger log = LoggerFactory.getLogger(SecuUserController.class);
	
	@Autowired
	private SecuUserService secuUserService;
	
	@RequestMapping(value= "/list", method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		List<SecuUser> list = secuUserService.selectByExample(new SecuUserExample());
		modelMap.put("userList", list);
		return "/sys/secuUser/userList";
	}
	
	@RequestMapping(value= "/create", method = RequestMethod.GET)
	public String create() {
		return "/sys/secuUser/editUser";
	}
	
	@RequestMapping(value= "/edit/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable(name="id") String id,ModelMap modelMap) {
		log.debug(id);
		SecuUser secuUser = secuUserService.selectByPrimaryKey(Long.parseLong(id));
		modelMap.put("user", secuUser);
		return "/sys/secuUser/editUser";
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(SecuUser user,ModelMap modelMap) {
		log.debug(user.toString());
		initModel(user);
		if(user.getId() == null) {
			secuUserService.insert(user);
		}
		else {
			secuUserService.updateByPrimaryKey(user);
		}
		return list(modelMap);
	}
	
	@RequestMapping(value= "/delete/{ids}", method = RequestMethod.GET)
	public String delete(@PathVariable(name="ids") String ids,ModelMap modelMap) {
		int cnt = secuUserService.deleteByPrimaryKeys(ids);
		log.debug(cnt + ":" + ids);
		return list(modelMap);
	}
}
