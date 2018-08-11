package com.ylsq.frame.sys.service;

import java.util.List;

import com.ylsq.common.base.BaseService;
import com.ylsq.frame.sys.dao.model.SysParamConfig;
import com.ylsq.frame.sys.dao.model.SysParamConfigExample;

/**
* SysParamConfigService接口
* Created by harper
*/
public interface SysParamConfigService extends BaseService<SysParamConfig, SysParamConfigExample> {

	/**
	 * 根据参数名查询配置信息
	 * @param paramName
	 * @return
	 */
	public List<SysParamConfig> selectByParamName(String paramName);
}