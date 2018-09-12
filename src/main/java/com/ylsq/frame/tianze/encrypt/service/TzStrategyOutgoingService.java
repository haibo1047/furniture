package com.ylsq.frame.tianze.encrypt.service;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyOutgoing;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyOutgoingExample;

/**
* TzStrategyOutgoingService接口
* Created by harper
*/
public interface TzStrategyOutgoingService extends BaseService<TzStrategyOutgoing, TzStrategyOutgoingExample> {

	/**
	 * 根据策略查询列表
	 * @param strategyName
	 * @return
	 */
	public TzStrategyOutgoing selectByStrategyName(String strategyName);
}