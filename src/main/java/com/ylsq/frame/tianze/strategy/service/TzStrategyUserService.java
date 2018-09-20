package com.ylsq.frame.tianze.strategy.service;

import java.util.List;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyUser;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyUserExample;

/**
* TzStrategyUserService接口
* Created by harper
*/
public interface TzStrategyUserService extends BaseService<TzStrategyUser, TzStrategyUserExample> {

	/**
	 * 根据策略名查询
	 * @param strategyName
	 * @return
	 */
	public List<TzStrategyUser> selectByStrategyName(String strategyName);
}