package com.ylsq.frame.tianze.base.web;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
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
import com.ylsq.frame.common.base.ValidateResult;
import com.ylsq.frame.tianze.base.TianzeConstant;
import com.ylsq.frame.tianze.base.dao.model.TzBaseOrg;
import com.ylsq.frame.tianze.base.dao.model.TzBaseOrgExample;
import com.ylsq.frame.tianze.base.dao.model.TzBaseUser;
import com.ylsq.frame.tianze.base.service.TzBaseOrgService;
import com.ylsq.frame.tianze.base.service.TzBaseUserService;

@Controller
@RequestMapping("/tz/org")
public class TzBaseOrgController extends BaseController {
	private static Logger log = LoggerFactory.getLogger(TzBaseOrgController.class);
	
	@Autowired
	private TzBaseOrgService tzBaseOrgService;
	@Autowired
	private TzBaseUserService tzBaseUserService;

	@RequestMapping(value= "/orglist", method = RequestMethod.GET)
	public String orglist(ModelMap modelMap) {
		return orglist(TianzeConstant.Root_Org_Id, modelMap);
	}
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
		if(StringUtils.isNotBlank(ids)) {
			String[] idArray = ids.split("-");
			Set<String> failedNames = new HashSet<>();
			for (String idStr : idArray) {
				if (StringUtils.isBlank(idStr)) {
					continue;
				}
				Long oid = Long.parseLong(idStr);
				List<TzBaseUser> list = tzBaseUserService.selectByOrgId(oid);
				if(list.size() == 0) {
					tzBaseOrgService.deleteByPrimaryKey(oid);
				}
				else {
					log.warn(oid + "已经被配置了某些用户，请先移除绑定的用户");
					failedNames.add(oid+"");
				}
				List<TzBaseOrg> olist = tzBaseOrgService.selectByParentId(oid);
				if(olist.size() == 0) {
					tzBaseOrgService.deleteByPrimaryKey(oid);
				}
				else {
					log.warn(oid + "存在子机构，请先移除子机构");
					failedNames.add(oid+"");
				}
			}
			
			if(failedNames.size()> 0) {
				modelMap.put("errorMsg", "机构("+String.join(",",failedNames)+")未删除成功，请先移除子机构再重试");
			}
			else {
				modelMap.put("errorMsg", "操作成功");
			}
		}
		return orglist(TianzeConstant.Root_Org_Id, modelMap);
	}
	
	protected ValidateResult validate(TzBaseOrg model) {
		TzBaseOrg org = tzBaseOrgService.selectByName(model.getOrgName());
		if(org != null && !(org.getId().equals(model.getId()))) {
			log.warn("已经存在此名称的机构："+ model.getOrgName());
			return new ValidateResult("机构名称已经存在");
		}
		return ValidateResult.Passed;
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(TzBaseOrg org, ModelMap modelMap) {
		log.debug(org.toString());
		initModel(org);
		ValidateResult vr = validate(org);
		if(!vr.isPassed()) {
			beforeEditOrg(org.getParentId(), modelMap);
			modelMap.put("model", org);
			modelMap.put("errorMsg", vr.getMsg());
			return webPrefix()+"edit";
		}
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
