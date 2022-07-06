package com.ylsq.frame.furniture.customer.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.furniture.customer.dao.mapper.FurnCustomerMapper;
import com.ylsq.frame.furniture.customer.dao.model.FurnCustomer;
import com.ylsq.frame.furniture.customer.dao.model.FurnCustomerExample;
import com.ylsq.frame.furniture.customer.service.FurnCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FurnCustomerService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class FurnCustomerServiceImpl extends BaseServiceImpl<FurnCustomerMapper, FurnCustomer, FurnCustomerExample> implements FurnCustomerService {

    private static final Logger log = LoggerFactory.getLogger(FurnCustomerServiceImpl.class);

    @Autowired
    FurnCustomerMapper furnCustomerMapper;

}