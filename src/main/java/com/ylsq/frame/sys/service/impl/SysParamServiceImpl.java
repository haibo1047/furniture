package com.ylsq.frame.sys.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.ylsq.frame.sys.dao.mapper.SysParamMapper;
import com.ylsq.frame.sys.dao.model.SysParam;
import com.ylsq.frame.sys.dao.model.SysParamExample;
import com.ylsq.frame.sys.service.SysParamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SysParamService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class SysParamServiceImpl extends BaseServiceImpl<SysParamMapper, SysParam, SysParamExample> implements SysParamService {

    private static final Logger log = LoggerFactory.getLogger(SysParamServiceImpl.class);

    @Autowired
    SysParamMapper sysParamMapper;

}