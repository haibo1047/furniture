package com.ylsq.frame.tianze.strategy.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.strategy.dao.mapper.TzStrategySoftwareMapper;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategySoftware;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategySoftwareExample;
import com.ylsq.frame.tianze.strategy.service.TzStrategySoftwareService;

/**
* TzStrategySoftwareService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzStrategySoftwareServiceImpl extends BaseServiceImpl<TzStrategySoftwareMapper, TzStrategySoftware, TzStrategySoftwareExample> implements TzStrategySoftwareService {

    private static final Logger log = LoggerFactory.getLogger(TzStrategySoftwareServiceImpl.class);

    @Autowired
    TzStrategySoftwareMapper tzStrategySoftwareMapper;

	@Override
	public List<TzStrategySoftware> selectByStrategyName(String strategyName) {
		// TODO Auto-generated method stub
		TzStrategySoftwareExample example = new TzStrategySoftwareExample();
		example.createCriteria().andStrategyNameEqualTo(strategyName);
		
		return selectByExample(example);
	}

	@Override
	public Set<String> selectSoftwareCodesByStrategyName(String strategyName) {
		// TODO Auto-generated method stub
		List<TzStrategySoftware> list = selectByStrategyName(strategyName);
		Set<String> softwareCodes = new HashSet<>();
		for(TzStrategySoftware one : list) {
			softwareCodes.add(one.getSoftwareCode());
		}
		return softwareCodes;
	}

}