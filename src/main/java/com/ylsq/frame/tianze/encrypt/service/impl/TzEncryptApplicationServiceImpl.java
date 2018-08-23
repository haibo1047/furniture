package com.ylsq.frame.tianze.encrypt.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.encrypt.dao.mapper.TzEncryptApplicationMapper;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptApplication;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptApplicationExample;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TzEncryptApplicationService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzEncryptApplicationServiceImpl extends BaseServiceImpl<TzEncryptApplicationMapper, TzEncryptApplication, TzEncryptApplicationExample> implements TzEncryptApplicationService {

    private static final Logger log = LoggerFactory.getLogger(TzEncryptApplicationServiceImpl.class);

    @Autowired
    TzEncryptApplicationMapper tzEncryptApplicationMapper;

}