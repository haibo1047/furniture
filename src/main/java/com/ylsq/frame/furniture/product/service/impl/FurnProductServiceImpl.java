package com.ylsq.frame.furniture.product.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.furniture.product.dao.mapper.FurnProductMapper;
import com.ylsq.frame.furniture.product.dao.model.FurnProduct;
import com.ylsq.frame.furniture.product.dao.model.FurnProductExample;
import com.ylsq.frame.furniture.product.service.FurnProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* FurnProductService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class FurnProductServiceImpl extends BaseServiceImpl<FurnProductMapper, FurnProduct, FurnProductExample> implements FurnProductService {

    private static final Logger log = LoggerFactory.getLogger(FurnProductServiceImpl.class);

    @Autowired
    FurnProductMapper furnProductMapper;

}