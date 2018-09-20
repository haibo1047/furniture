package com.ylsq.frame.tianze.strategy.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.strategy.dao.mapper.TzStrategyWatermarkMapper;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermark;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermarkExample;
import com.ylsq.frame.tianze.strategy.service.TzStrategyWatermarkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TzStrategyWatermarkService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzStrategyWatermarkServiceImpl extends BaseServiceImpl<TzStrategyWatermarkMapper, TzStrategyWatermark, TzStrategyWatermarkExample> implements TzStrategyWatermarkService {

    private static final Logger log = LoggerFactory.getLogger(TzStrategyWatermarkServiceImpl.class);

    @Autowired
    TzStrategyWatermarkMapper tzStrategyWatermarkMapper;

}