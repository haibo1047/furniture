package com.ylsq.frame.sys.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.ylsq.frame.sys.dao.mapper.SysParamValueMapper;
import com.ylsq.frame.sys.dao.model.SysParamValue;
import com.ylsq.frame.sys.dao.model.SysParamValueExample;
import com.ylsq.frame.sys.service.SysParamValueService;

/**
* SysParamValueService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class SysParamValueServiceImpl extends BaseServiceImpl<SysParamValueMapper, SysParamValue, SysParamValueExample> implements SysParamValueService {

    private static final Logger log = LoggerFactory.getLogger(SysParamValueServiceImpl.class);

    @Autowired
    SysParamValueMapper sysParamValueMapper;
    
    @Override
	public List<SysParamValue> selectByParamName(String paramName) {
		// TODO Auto-generated method stub
		SysParamValueExample example = new SysParamValueExample();
		example.createCriteria().andParamNameEqualTo(paramName);
		return selectByExample(example);
	}
}