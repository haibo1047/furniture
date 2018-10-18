package com.ylsq.frame.tianze.strategy.service;

import java.util.List;
import java.util.Set;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategySoftware;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategySoftwareExample;

/**
* TzStrategySoftwareService接口
* Created by harper
*/
public interface TzStrategySoftwareService extends BaseService<TzStrategySoftware, TzStrategySoftwareExample> {

	/**
	 * 根据策略名查询
	 * @param strategyName
	 * @return
	 */
	public List<TzStrategySoftware> selectByStrategyName(String strategyName);
	
	/**
	 * 根据策略名查询软件名称
	 * @param strategyName
	 * @return
	 */
	public Set<String> selectSoftwareCodesByStrategyName(String strategyName);
}