package com.ylsq.frame.base.service;

import com.ylsq.common.base.BaseService;
import com.ylsq.frame.base.dao.model.SecuRole;
import com.ylsq.frame.base.dao.model.SecuRoleExample;

/**
* SecuRoleService接口
* Created by shuzheng on 2018/8/5.
*/
public interface SecuRoleService extends BaseService<SecuRole, SecuRoleExample> {

	/**
	 * 根据roleName查询角色
	 * @param roleName
	 * @return
	 */
	public SecuRole selectByRoleName(String roleName);
}