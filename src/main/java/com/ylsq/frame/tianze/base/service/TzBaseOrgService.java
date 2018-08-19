package com.ylsq.frame.tianze.base.service;

import java.util.List;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.base.custobj.CustOrg;
import com.ylsq.frame.tianze.base.dao.model.TzBaseOrg;
import com.ylsq.frame.tianze.base.dao.model.TzBaseOrgExample;

/**
* TzBaseOrgService接口
* Created by harper
*/
public interface TzBaseOrgService extends BaseService<TzBaseOrg, TzBaseOrgExample> {

	/**
	 * 根据机构名称查询
	 * @param orgName
	 * @return
	 */
	public TzBaseOrg selectByName(String orgName);
	
	/**
	 * 根据父id查询子机构列表
	 * @param parentId
	 * @return
	 */
	public List<TzBaseOrg> selectByParentId(long parentId);
	
	/**
	 * 重构机构树，可以为jsTree使用
	 * @param list
	 * @return
	 */
	public List<CustOrg> buildCustomOrgs(List<TzBaseOrg> list);
}