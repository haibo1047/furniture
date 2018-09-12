package com.ylsq.frame.tianze.encrypt.service;

import java.util.List;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyUser;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyUserExample;

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