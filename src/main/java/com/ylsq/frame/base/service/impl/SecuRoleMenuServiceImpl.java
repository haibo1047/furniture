package com.ylsq.frame.base.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.frame.base.dao.mapper.SecuRoleMenuMapper;
import com.ylsq.frame.base.dao.model.SecuRoleMenu;
import com.ylsq.frame.base.dao.model.SecuRoleMenuExample;
import com.ylsq.frame.base.service.SecuRoleMenuService;
import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;

/**
* SecuRoleMenuService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class SecuRoleMenuServiceImpl extends BaseServiceImpl<SecuRoleMenuMapper, SecuRoleMenu, SecuRoleMenuExample> implements SecuRoleMenuService {

    private static final Logger log = LoggerFactory.getLogger(SecuRoleMenuServiceImpl.class);

    @Autowired
    SecuRoleMenuMapper secuRoleMenuMapper;

	@Override
	public List<SecuRoleMenu> selectByRoleName(String roleName) {
		// TODO Auto-generated method stub
		SecuRoleMenuExample example = new SecuRoleMenuExample();
		example.createCriteria().andRoleNameEqualTo(roleName);
		return selectByExample(example);
	}
}