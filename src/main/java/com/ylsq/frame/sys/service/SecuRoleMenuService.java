package com.ylsq.frame.sys.service;

import java.util.List;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.sys.dao.model.SecuRoleMenu;
import com.ylsq.frame.sys.dao.model.SecuRoleMenuExample;

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