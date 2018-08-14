package com.ylsq.frame.sys.service;

import java.util.List;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.sys.dao.model.SysParamValue;
import com.ylsq.frame.sys.dao.model.SysParamValueExample;

/**
* SysParamValueService接口
* Created by harper
*/
public interface SysParamValueService extends BaseService<SysParamValue, SysParamValueExample> {

	/**
	 * 根据参数名查询参数值列表
	 * @param paramName
	 * @return
	 */
	public List<SysParamValue> selectByParamName(String paramName);
}