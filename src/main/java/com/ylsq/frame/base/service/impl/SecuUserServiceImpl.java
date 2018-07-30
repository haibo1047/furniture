package com.ylsq.frame.base.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.ylsq.frame.base.dao.mapper.SecuUserMapper;
import com.ylsq.frame.base.dao.model.SecuUser;
import com.ylsq.frame.base.dao.model.SecuUserExample;
import com.ylsq.frame.base.service.SecuUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SecuUserService实现
* Created by shuzheng on 2018/7/26.
*/
@Service
@Transactional
@BaseService
public class SecuUserServiceImpl extends BaseServiceImpl<SecuUserMapper, SecuUser, SecuUserExample> implements SecuUserService {

    private static final Logger log = LoggerFactory.getLogger(SecuUserServiceImpl.class);

    @Autowired
    SecuUserMapper secuUserMapper;

}