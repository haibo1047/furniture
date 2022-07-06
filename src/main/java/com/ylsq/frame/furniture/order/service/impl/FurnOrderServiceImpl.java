package com.ylsq.frame.furniture.order.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.furniture.order.dao.mapper.FurnOrderMapper;
import com.ylsq.frame.furniture.order.dao.model.FurnOrder;
import com.ylsq.frame.furniture.order.dao.model.FurnOrderExample;
import com.ylsq.frame.furniture.order.service.FurnOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FurnOrderService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class FurnOrderServiceImpl extends BaseServiceImpl<FurnOrderMapper, FurnOrder, FurnOrderExample> implements FurnOrderService {

    private static final Logger log = LoggerFactory.getLogger(FurnOrderServiceImpl.class);

    @Autowired
    FurnOrderMapper furnOrderMapper;

}