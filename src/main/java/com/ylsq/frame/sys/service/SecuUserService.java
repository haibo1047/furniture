package com.ylsq.frame.sys.service;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.sys.dao.model.SecuUser;
import com.ylsq.frame.sys.dao.model.SecuUserExample;

/**
* SecuUserService接口
* Created by shuzheng on 2018/7/26.
*/
public interface SecuUserService extends BaseService<SecuUser, SecuUserExample> {

	/**
	 * 根据用户名查询用户对象
	 * @param username
	 * @return
	 */
	public SecuUser selectByUsername(String username);
}