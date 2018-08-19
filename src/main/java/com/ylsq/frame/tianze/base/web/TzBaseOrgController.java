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

import com.ylsq.frame.common.base.BaseController;
import com.ylsq.frame.common.base.BaseExample;
import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.base.TianzeConstant;
import com.ylsq.frame.tianze.base.dao.model.TzBaseOrg;
import com.ylsq.frame.tianze.base.dao.model.TzBaseOrgExample;
import com.ylsq.frame.tianze.base.service.TzBaseOrgService;

@Controller
@RequestMapping("/tz/org")
public class TzBaseOrgController extends BaseController {
	private static Logger log = LoggerFactory.getLogger(TzBaseOrgController.class);
	
	@Autowired
	private TzBaseOrgService tzBaseOrgService;

	@RequestMapping(value= "/orglist/{parnetId}", method = RequestMethod.GET)
	public String orglist(@PathVariable(name="parnetId") Long parentId, ModelMap modelMap) {
		log.debug("parnet id : " + parentId);
		List<TzBaseOrg> list = tzBaseOrgService.selectByExample(new TzBaseOrgExample());
		List<TzBaseOrg> subList = tzBaseOrgService.selectByParentId(parentId);
		modelMap.put("defaultId", parentId);
		modelMap.put("subList", subList);
		modelMap.put("modelList", tzBaseOrgService.buildCustomOrgs(list));
		return webPrefix()+"list";
	}
	
	@RequestMapping(value= "/createOrg", method = RequestMethod.GET)
	public String create(@RequestParam("parentId") Long parentId, ModelMap modelMap) {
		beforeEditOrg(parentId, modelMap);
		return webPrefix()+"edit";
	}
	@RequestMapping(value= "/editOrg/{id}", method = RequestMethod.GET)
	public String edit(@PathVariable(name="id") String id,ModelMap modelMap) {
		log.debug(id);
		TzBaseOrg model = tzBaseOrgService.selectByPrimaryKey(Long.parseLong(id));
		beforeEditOrg(model.getParentId(), modelMap);
		modelMap.put("model", model);
		return webPrefix()+"edit";
	}
	
	protected void beforeEditOrg(Long parentId, ModelMap modelMap) {
		TzBaseOrg parentOrg = new TzBaseOrg();
		if(parentId == TianzeConstant.Root_Org_Id) {
			parentOrg.setOrgName("Root");
			parentOrg.setId(TianzeConstant.Root_Org_Id);
		}
		else {
			parentOrg = tzBaseOrgService.selectByPrimaryKey(parentId);
		}
		
		modelMap.put("parentOrg", parentOrg);
		// TODO Auto-generated method stub
		super.beforeEdit(modelMap);
	}
	@RequestMapping(value= "/deleteOrgs/{ids}", method = RequestMethod.GET)
	public String delete(@PathVariable(name="ids") String ids,ModelMap modelMap) {
		int cnt = getService().deleteByPrimaryKeys(ids);
		log.debug(cnt + ":" + ids);
		return orglist(0l, modelMap);
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(TzBaseOrg org, ModelMap modelMap) {
		log.debug(org.toString());
		initModel(org);
		if(org.getId() == null) {
			tzBaseOrgService.insert(org);
		}
		else {
			tzBaseOrgService.updateByPrimaryKey(org);
		}
		return orglist(org.getParentId(), modelMap);
	}
	
	
	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return tzBaseOrgService;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/tz/org/";
	}

}
