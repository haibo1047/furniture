package com.ylsq.frame.tianze.base.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ylsq.frame.common.base.BaseExample;
import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.common.base.BaseModelController;
import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.common.base.SystemConstants;
import com.ylsq.frame.common.base.ValidateResult;
import com.ylsq.frame.common.util.PasswordUtils;
import com.ylsq.frame.tianze.base.TianzeConstant;
import com.ylsq.frame.tianze.base.custobj.CustOrg;
import com.ylsq.frame.tianze.base.dao.model.TzBaseOrg;
import com.ylsq.frame.tianze.base.dao.model.TzBaseOrgExample;
import com.ylsq.frame.tianze.base.dao.model.TzBaseUser;
import com.ylsq.frame.tianze.base.service.TzBaseOrgService;
import com.ylsq.frame.tianze.base.service.TzBaseUserService;



/**
 * ${modelname}controller
 * Created by Harper.
 */
@Controller
@RequestMapping("/tz/user")
public class TzBaseUserController extends BaseModelController {
    private static final Logger log = LoggerFactory.getLogger(TzBaseUserController.class);
	
	@Autowired
	private TzBaseUserService tzBaseUserService;
	@Autowired
	private TzBaseOrgService tzBaseOrgService;
	
	@RequestMapping("/userlist")
	public String userList(ModelMap modelMap) {
		return userList(SystemConstants.Root_Org_Id, modelMap);
	}
	
	@RequestMapping("/userlist/{orgId}")
	public String userList(@PathVariable("orgId") Long orgId, ModelMap modelMap) {
		List<TzBaseOrg> list = tzBaseOrgService.selectByExample(new TzBaseOrgExample());
		List<CustOrg> orgList = tzBaseOrgService.buildCustomOrgs(list);
		List<TzBaseUser> userList = tzBaseUserService.selectByOrgId(orgId);
		
		modelMap.put("modelList", userList);
		modelMap.put("orgList", orgList);
		modelMap.put("defaultId", orgId);
		return webPrefix() + "list";
	}
	
	protected ValidateResult validate(TzBaseUser model) {
		TzBaseUser user = tzBaseUserService.selectByLoginId(model.getLoginId());
		if(user != null && !(user.getId().equals(model.getId()))) {
			log.warn("已经存在此登录名的用户："+ model.getLoginId());
			return new ValidateResult("登录名已经存在");
		}
		return ValidateResult.Passed;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(TzBaseUser tzBaseUser,ModelMap modelMap) {
		log.debug(tzBaseUser.toString());
		initModel(tzBaseUser);
		ValidateResult vr = validate(tzBaseUser);
		if(!vr.isPassed()) {
			modelMap.put("model", tzBaseUser);
			modelMap.put("errorMsg", vr.getMsg());
			return webPrefix()+"edit";
		}
		if(tzBaseUser.getId() == null) {
			String pwd = PasswordUtils.encode(TianzeConstant.Default_Password, TianzeConstant.Salt_Pwd);
			tzBaseUser.setPassword(pwd);
			tzBaseUserService.insert(tzBaseUser);
		}
		else {
			tzBaseUserService.updateByPrimaryKey(tzBaseUser);
		}
		return userList(modelMap);
	}
	
	@RequestMapping(value= "/createUser", method = RequestMethod.GET)
	public String create(@RequestParam("orgId") Long orgId, ModelMap modelMap) {
		beforeEdit(orgId, modelMap);
		return webPrefix()+"edit";
	}
	
	@RequestMapping(value= "/editUser/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable(name="id") String id,ModelMap modelMap) {
		log.debug(id);
		TzBaseUser model = tzBaseUserService.selectByPrimaryKey(Long.parseLong(id));
		beforeEdit(model.getOrgId(), modelMap);
		modelMap.put("model", model);
		return webPrefix()+"edit";
	}
	
	protected void beforeEdit(Long orgId, ModelMap modelMap) {
		TzBaseOrg org = new TzBaseOrg();
		if(orgId == SystemConstants.Root_Org_Id) {
			org.setOrgName("Root");
			org.setId(SystemConstants.Root_Org_Id);
		}
		else {
			org = tzBaseOrgService.selectByPrimaryKey(orgId);
		}
		
		modelMap.put("org", org);
		// TODO Auto-generated method stub
		super.beforeEdit(modelMap);
	}
	
	@RequestMapping(value= "/deleteUsers/{orgId}/{ids}", method = RequestMethod.GET)
	public String delete(@PathVariable(name="orgId") Long orgId, @PathVariable(name="ids") String ids, ModelMap modelMap) {
		int cnt = getService().deleteByPrimaryKeys(ids);
		log.debug(cnt + ":" + ids);
		return userList(orgId, modelMap);
	}
	
	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return tzBaseUserService;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/tz/user/";
	}
}