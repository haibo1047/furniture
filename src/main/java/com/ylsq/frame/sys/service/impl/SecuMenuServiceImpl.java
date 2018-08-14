package com.ylsq.frame.sys.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.sys.dao.mapper.SecuMenuMapper;
import com.ylsq.frame.sys.dao.model.SecuMenu;
import com.ylsq.frame.sys.dao.model.SecuMenuExample;
import com.ylsq.frame.sys.service.SecuMenuService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SecuMenuService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class SecuMenuServiceImpl extends BaseServiceImpl<SecuMenuMapper, SecuMenu, SecuMenuExample> implements SecuMenuService {

    private static final Logger log = LoggerFactory.getLogger(SecuMenuServiceImpl.class);

    @Autowired
    SecuMenuMapper secuMenuMapper;

}