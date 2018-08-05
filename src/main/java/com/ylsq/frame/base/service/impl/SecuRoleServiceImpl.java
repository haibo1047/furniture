package com.ylsq.frame.base.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.ylsq.frame.base.dao.mapper.SecuRoleMapper;
import com.ylsq.frame.base.dao.model.SecuRole;
import com.ylsq.frame.base.dao.model.SecuRoleExample;
import com.ylsq.frame.base.service.SecuRoleService;

/**
* SecuRoleService实现
* Created by shuzheng on 2018/8/5.
*/
@Service
@Transactional
@BaseService
public class SecuRoleServiceImpl extends BaseServiceImpl<SecuRoleMapper, SecuRole, SecuRoleExample> implements SecuRoleService {

    private static final Logger log = LoggerFactory.getLogger(SecuRoleServiceImpl.class);

    @Autowired
    SecuRoleMapper secuRoleMapper;

	@Override
	public SecuRole selectByRoleName(String roleName) {
		// TODO Auto-generated method stub
		SecuRoleExample example = new SecuRoleExample();
		example.createCriteria().andRoleNameEqualTo(roleName);
		List<SecuRole> roleList = selectByExample(example);
		for(SecuRole role : roleList) {
			if(role.getRecStatus() == SecuRole.recStatus_valid)
				return role;
			log.debug(role.getRoleName() + "is not available");
		}
		return null;
	}

}