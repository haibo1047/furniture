package com.ylsq.frame.base.service;

import java.util.List;

import com.ylsq.frame.base.dao.model.SecuRoleMenu;
import com.ylsq.frame.base.dao.model.SecuRoleMenuExample;
import com.ylsq.frame.common.base.BaseService;

/**
* SecuRoleMenuService接口
* Created by harper
*/
public interface SecuRoleMenuService extends BaseService<SecuRoleMenu, SecuRoleMenuExample> {

	/**
	 * 根据角色名查找角色菜单关联关系表
	 * @param roleName
	 * @return
	 */
	public List<SecuRoleMenu> selectByRoleName(String roleName);
}