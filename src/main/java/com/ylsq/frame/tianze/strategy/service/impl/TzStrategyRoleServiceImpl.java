package com.ylsq.frame.tianze.strategy.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.strategy.dao.mapper.TzStrategyRoleMapper;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyRole;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyRoleExample;
import com.ylsq.frame.tianze.strategy.service.TzStrategyRoleService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TzStrategyRoleService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzStrategyRoleServiceImpl extends BaseServiceImpl<TzStrategyRoleMapper, TzStrategyRole, TzStrategyRoleExample> implements TzStrategyRoleService {

    private static final Logger log = LoggerFactory.getLogger(TzStrategyRoleServiceImpl.class);

    @Autowired
    TzStrategyRoleMapper tzStrategyRoleMapper;

	@Override
	public List<TzStrategyRole> selectByStrategyName(String strategyName) {
		// TODO Auto-generated method stub
		TzStrategyRoleExample example = new TzStrategyRoleExample();
		example.createCriteria().andStrategyNameEqualTo(strategyName);
		return selectByExample(example);
	}

}