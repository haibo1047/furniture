package com.ylsq.frame.sys.base.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.sys.base.dao.mapper.SysProfileMapper;
import com.ylsq.frame.sys.base.dao.model.SysProfile;
import com.ylsq.frame.sys.base.dao.model.SysProfileExample;
import com.ylsq.frame.sys.base.service.SysProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SysProfileService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class SysProfileServiceImpl extends BaseServiceImpl<SysProfileMapper, SysProfile, SysProfileExample> implements SysProfileService {

    private static final Logger log = LoggerFactory.getLogger(SysProfileServiceImpl.class);

    @Autowired
    SysProfileMapper sysProfileMapper;

}