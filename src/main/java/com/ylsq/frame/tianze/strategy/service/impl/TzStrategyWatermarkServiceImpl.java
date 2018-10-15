package com.ylsq.frame.tianze.strategy.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.strategy.dao.mapper.TzStrategyWatermarkMapper;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermark;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermarkExample;
import com.ylsq.frame.tianze.strategy.service.TzStrategyWatermarkService;

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

	@Override
	public TzStrategyWatermark selectByStrategyId(Long strategyId) {
		// TODO Auto-generated method stub
		TzStrategyWatermarkExample example = new TzStrategyWatermarkExample();
		example.createCriteria().andStrategyIdEqualTo(strategyId).andRecStatusEqualTo(TzStrategyWatermark.recStatus_valid);
		List<TzStrategyWatermark> list = selectByExample(example);
		if(list.size()>0)
			return list.get(0);
		return null;
	}

}