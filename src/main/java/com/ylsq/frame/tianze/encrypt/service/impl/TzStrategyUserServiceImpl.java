package com.ylsq.frame.tianze.encrypt.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.encrypt.dao.mapper.TzStrategyUserMapper;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyUser;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyUserExample;
import com.ylsq.frame.tianze.encrypt.service.TzStrategyUserService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TzStrategyUserService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzStrategyUserServiceImpl extends BaseServiceImpl<TzStrategyUserMapper, TzStrategyUser, TzStrategyUserExample> implements TzStrategyUserService {

    private static final Logger log = LoggerFactory.getLogger(TzStrategyUserServiceImpl.class);

    @Autowired
    TzStrategyUserMapper tzStrategyUserMapper;

	@Override
	public List<TzStrategyUser> selectByStrategyName(String strategyName) {
		// TODO Auto-generated method stub
		TzStrategyUserExample example = new TzStrategyUserExample();
		example.createCriteria().andStrategyNameEqualTo(strategyName);
		
		return selectByExample(example);
	}

}