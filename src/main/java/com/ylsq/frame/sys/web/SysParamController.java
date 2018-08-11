package com.ylsq.frame.sys.web;

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
import com.ylsq.common.base.BaseExample;
import com.ylsq.common.base.BaseModel;
import com.ylsq.common.base.BaseService;
import com.ylsq.frame.sys.dao.model.SysParam;
import com.ylsq.frame.sys.dao.model.SysParamConfig;
import com.ylsq.frame.sys.dao.model.SysParamExample;
import com.ylsq.frame.sys.service.SysParamConfigService;
import com.ylsq.frame.sys.service.SysParamService;

@Controller
@RequestMapping("/sys/param")
public class SysParamController extends BaseController {
	private static Logger log = LoggerFactory.getLogger(SysParamController.class);
	
	@Autowired
	private SysParamService sysParamService;
	@Autowired
	private SysParamConfigService sysParamConfigService;
	
	
	@RequestMapping(value= "/values/{paramName}", method = RequestMethod.GET)
	public String values(@PathVariable(value="paramName")String paramName,ModelMap modelMap) {
		modelMap.put("paramName", paramName);
		return webPrefix()+"valueList";
	}
	
	@RequestMapping(value= "/createConfig/{paramName}", method = RequestMethod.GET)
	public String createConfig(@PathVariable(value="paramName")String paramName,ModelMap modelMap) {
		modelMap.put("paramName", paramName);
		return webPrefix()+"editConfig";
	}
	
	@RequestMapping(value= "/editConfig/{id}", method = RequestMethod.GET)
	public String editConfig(@PathVariable(name="id") String id,ModelMap modelMap) {
		log.debug(id);
		SysParamConfig model = sysParamConfigService.selectByPrimaryKey(Long.parseLong(id));
		modelMap.put("model", model);
		modelMap.put("paramName", model.getParamName());
		return webPrefix()+"editConfig";
	}
	@RequestMapping(value= "/saveConfig", method = RequestMethod.POST)
	public String saveConfig(SysParamConfig param,ModelMap modelMap) {
		log.debug(param.toString());
		initModel(param);
		if(param.getId() == null) {
			sysParamConfigService.insert(param);
		}
		else {
			sysParamConfigService.updateByPrimaryKey(param);
		}
		return config(param.getParamName(),modelMap);
	}
	@RequestMapping(value= "/deleteConfig/{paramName}/{ids}", method = RequestMethod.GET)
	public String deleteConfig(@PathVariable(value="paramName")String paramName,@PathVariable(name="ids") String ids,ModelMap modelMap) {
		int cnt = getService().deleteByPrimaryKeys(ids);
		log.debug(cnt + ":" + ids);
		return config(paramName,modelMap);
	}
	
	@RequestMapping(value="/config/{paramName}", method = RequestMethod.GET)
	public String config(@PathVariable(value="paramName")String paramName, ModelMap modelMap) {
		List<SysParamConfig> configList = sysParamConfigService.selectByParamName(paramName);
		
		modelMap.put("configList", configList);
		modelMap.put("paramName", paramName);
		return webPrefix() + "configList";
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(SysParam param,ModelMap modelMap) {
		log.debug(param.toString());
		initModel(param);
		if(param.getId() == null) {
			sysParamService.insert(param);
		}
		else {
			sysParamService.updateByPrimaryKey(param);
		}
		return list(modelMap);
	}
	
	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return sysParamService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		return sysParamService.selectByExample(new SysParamExample());
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "sys/param/";
	}

}
