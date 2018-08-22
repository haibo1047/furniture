package com.ylsq.frame.tianze.encrypt.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.encrypt.dao.mapper.TzEncryptTerminalMapper;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminal;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminalExample;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptTerminalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TzEncryptTerminalService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzEncryptTerminalServiceImpl extends BaseServiceImpl<TzEncryptTerminalMapper, TzEncryptTerminal, TzEncryptTerminalExample> implements TzEncryptTerminalService {

    private static final Logger log = LoggerFactory.getLogger(TzEncryptTerminalServiceImpl.class);

    @Autowired
    TzEncryptTerminalMapper tzEncryptTerminalMapper;

}