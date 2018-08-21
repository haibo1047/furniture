package com.ylsq.frame.tianze.base.service;

import java.util.List;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.base.dao.model.TzBaseUser;
import com.ylsq.frame.tianze.base.dao.model.TzBaseUserExample;

/**
* TzBaseUserService接口
* Created by harper
*/
public interface TzBaseUserService extends BaseService<TzBaseUser, TzBaseUserExample> {

	/**
	 * 根据机构ID查询用户
	 * @param orgId
	 * @return
	 */
	public List<TzBaseUser> selectByOrgId(Long orgId);
	
	/**
	 * 根据登录名查询用户
	 * @param loginId
	 * @return
	 */
	public TzBaseUser selectByLoginId(String loginId);
}