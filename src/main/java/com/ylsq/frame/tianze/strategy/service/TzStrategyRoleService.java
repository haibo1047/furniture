package com.ylsq.frame.tianze.strategy.service;

import java.util.List;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyRole;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyRoleExample;

/**
* TzStrategyRoleService接口
* Created by harper
*/
public interface TzStrategyRoleService extends BaseService<TzStrategyRole, TzStrategyRoleExample> {

	/**
	 * 根据策略名查询用户组
	 * @param strategyName
	 * @return
	 */
	public List<TzStrategyRole> selectByStrategyName(String strategyName);
	
	/**
	 * 根据角色查询所有策略
	 * @param roleName
	 * @return
	 */
	public List<TzStrategyRole> selectByRoleName(String roleName);
}