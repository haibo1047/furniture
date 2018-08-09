package com.ylsq.frame.base.service;

import java.util.List;

import com.ylsq.common.base.BaseService;
import com.ylsq.frame.base.dao.model.SecuUserRole;
import com.ylsq.frame.base.dao.model.SecuUserRoleExample;

/**
* SecuUserRoleService接口
* Created by harper
*/
public interface SecuUserRoleService extends BaseService<SecuUserRole, SecuUserRoleExample> {

	/**
	 * 根据角色名查询用户角色关联关系表
	 * @param roleName
	 * @return
	 */
	public List<SecuUserRole> selectByRoleName(String roleName);
}