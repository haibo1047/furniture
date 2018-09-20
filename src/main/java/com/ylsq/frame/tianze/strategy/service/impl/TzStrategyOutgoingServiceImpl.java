package com.ylsq.frame.tianze.strategy.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.strategy.dao.mapper.TzStrategyOutgoingMapper;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyOutgoing;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyOutgoingExample;
import com.ylsq.frame.tianze.strategy.service.TzStrategyOutgoingService;

/**
* TzStrategyOutgoingService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzStrategyOutgoingServiceImpl extends BaseServiceImpl<TzStrategyOutgoingMapper, TzStrategyOutgoing, TzStrategyOutgoingExample> implements TzStrategyOutgoingService {

    private static final Logger log = LoggerFactory.getLogger(TzStrategyOutgoingServiceImpl.class);

    @Autowired
    TzStrategyOutgoingMapper tzStrategyOutgoingMapper;

	@Override
	public TzStrategyOutgoing selectByStrategyName(String strategyName) {
		// TODO Auto-generated method stub
		TzStrategyOutgoingExample example = new TzStrategyOutgoingExample();
		example.createCriteria().andStrategyNameEqualTo(strategyName);
		List<TzStrategyOutgoing> list = selectByExample(example);
		if(list.size()>0)
			return list.get(0);
		return null;
	}

}