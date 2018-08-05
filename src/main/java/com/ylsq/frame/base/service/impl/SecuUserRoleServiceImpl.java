package com.ylsq.frame.base.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.ylsq.frame.base.dao.mapper.SecuUserRoleMapper;
import com.ylsq.frame.base.dao.model.SecuUserRole;
import com.ylsq.frame.base.dao.model.SecuUserRoleExample;
import com.ylsq.frame.base.service.SecuUserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SecuUserRoleService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class SecuUserRoleServiceImpl extends BaseServiceImpl<SecuUserRoleMapper, SecuUserRole, SecuUserRoleExample> implements SecuUserRoleService {

    private static final Logger log = LoggerFactory.getLogger(SecuUserRoleServiceImpl.class);

    @Autowired
    SecuUserRoleMapper secuUserRoleMapper;

}