package com.ylsq.frame.tianze.encrypt.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.kahadb.util.ByteArrayInputStream;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ylsq.frame.common.base.BaseController;
import com.ylsq.frame.common.base.BaseExample;
import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.common.base.SysParamEnum;
import com.ylsq.frame.common.base.ValidateResult;
import com.ylsq.frame.sys.base.service.SysBlobService;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptClient;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptClientExample;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptClientService;



/**
 * Created by Harper.
 */
@Controller
@RequestMapping("/tz/client")
public class TzEncryptClientController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(TzEncryptClientController.class);
	
	@Autowired
	private TzEncryptClientService tzEncryptClientService;
	@Autowired
	private SysBlobService sysBlobService;
	
	@RequestMapping(value="/download/{clientId}", method = RequestMethod.GET)
	public void download(@PathVariable(value="clientId") Long clientId,HttpServletResponse response) {
		try {
			byte[] data = sysBlobService.getData(clientId);
			if(data == null) {
				response.getWriter().write("未找到文件!");
				return;
			}
			InputStream is = new ByteArrayInputStream(data);
			IOUtils.copy(is, response.getOutputStream());
			response.flushBuffer();
		} catch (IOException ex) {
			log.error("下载文件失败：" + ex.getMessage());
			throw new RuntimeException("下载文件失败:" + ex.getMessage());
		}
	}
	
	
	@Override
	public String list(@RequestParam(required = false, defaultValue = "1", value = "pageNum")int pageNum, ModelMap modelMap) {
		// TODO Auto-generated method stub
		int pageSize = (int)SecurityUtils.getSubject().getSession().getAttribute("pageSize");
		modelMap.put("modelList", tzEncryptClientService.selectByExampleForStartPage(new TzEncryptClientExample(), pageNum, pageSize));
		modelMap.put("total", tzEncryptClientService.countByExample(new TzEncryptClientExample()));
		modelMap.put("appTypeList", getParams(SysParamEnum.Application_Type.getConstant()));
		return webPrefix() + "list";
	}


	protected ValidateResult validate(TzEncryptClient model) {
		return ValidateResult.Passed;
	}

	@RequestMapping(value= "/upload/{clientId}", method = RequestMethod.GET)
	public String upload(@PathVariable(value="clientId") Long clientId,ModelMap modelMap) {
		modelMap.put("clientId", clientId);
		return webPrefix() + "upload";
	}
	
	@RequestMapping(value= "/upload", method = RequestMethod.POST)
	public String upload(MultipartFile file,@RequestParam("clientId") Long clientId,ModelMap modelMap) {
		tzEncryptClientService.uploadClientFile(clientId, file);
		return list(modelMap);
	}
	
	@RequestMapping(value= "/save", method = RequestMethod.POST)
	public String save(TzEncryptClient model,ModelMap modelMap) {
		log.debug(model.toString());
		initModel(model);
		
		ValidateResult vr = validate(model);
		if(!vr.isPassed()) {
			modelMap.put("model", model);
			modelMap.put("errorMsg", vr.getMsg());
			log.error(vr.getMsg());
			return webPrefix()+"edit";
		}
		if(model.getId() == null) {
			tzEncryptClientService.insert(model);
		}
		else {
			tzEncryptClientService.updateByPrimaryKey(model);
		}
		return list(modelMap);
	}
	
	@Override
	protected BaseService<? extends BaseModel, ? extends BaseExample> getService() {
		// TODO Auto-generated method stub
		return tzEncryptClientService;
	}

	@Override
	protected List<? extends BaseModel> getModelList() {
		// TODO Auto-generated method stub
		List<TzEncryptClient> list = tzEncryptClientService.selectByExample(new TzEncryptClientExample());
		return list;
	}

	@Override
	protected String webPrefix() {
		// TODO Auto-generated method stub
		return "/tz/client/";
	}
}