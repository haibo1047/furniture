package com.ylsq.frame.sys.base.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.sys.base.dao.mapper.SysLogMapper;
import com.ylsq.frame.sys.base.dao.model.SysLog;
import com.ylsq.frame.sys.base.dao.model.SysLogExample;
import com.ylsq.frame.sys.base.service.SysLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SysLogService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class SysLogServiceImpl extends BaseServiceImpl<SysLogMapper, SysLog, SysLogExample> implements SysLogService {

    private static final Logger log = LoggerFactory.getLogger(SysLogServiceImpl.class);

    @Autowired
    SysLogMapper sysLogMapper;

}