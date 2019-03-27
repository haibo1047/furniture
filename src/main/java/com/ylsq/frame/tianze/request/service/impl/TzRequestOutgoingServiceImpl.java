package com.ylsq.frame.tianze.request.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.request.dao.mapper.TzRequestOutgoingMapper;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoing;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoingExample;
import com.ylsq.frame.tianze.request.service.TzRequestOutgoingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TzRequestOutgoingService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzRequestOutgoingServiceImpl extends BaseServiceImpl<TzRequestOutgoingMapper, TzRequestOutgoing, TzRequestOutgoingExample> implements TzRequestOutgoingService {

    private static final Logger log = LoggerFactory.getLogger(TzRequestOutgoingServiceImpl.class);

    @Autowired
    TzRequestOutgoingMapper tzRequestOutgoingMapper;

}