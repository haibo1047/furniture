package com.ylsq.frame.tianze.base.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.common.base.SystemConstants;
import com.ylsq.frame.tianze.base.dao.mapper.TzBaseUserMapper;
import com.ylsq.frame.tianze.base.dao.model.TzBaseUser;
import com.ylsq.frame.tianze.base.dao.model.TzBaseUserExample;
import com.ylsq.frame.tianze.base.service.TzBaseUserService;

/**
* TzBaseUserService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzBaseUserServiceImpl extends BaseServiceImpl<TzBaseUserMapper, TzBaseUser, TzBaseUserExample> implements TzBaseUserService {

    private static final Logger log = LoggerFactory.getLogger(TzBaseUserServiceImpl.class);

    @Autowired
    TzBaseUserMapper tzBaseUserMapper;

	@Override
	public List<TzBaseUser> selectByOrgId(Long orgId) {
		// TODO Auto-generated method stub
		TzBaseUserExample example = new TzBaseUserExample();
		if(SystemConstants.Root_Org_Id != orgId) {
			example.createCriteria().andOrgIdEqualTo(orgId);
		}
		return selectByExample(example);
	}

	@Override
	public TzBaseUser selectByLoginId(String loginId) {
		// TODO Auto-generated method stub
		TzBaseUserExample example = new TzBaseUserExample();
		example.createCriteria().andLoginIdEqualTo(loginId);
		List<TzBaseUser> users = selectByExample(example);
		if(users.size()>0)
			return users.get(0);
		return null;
	}

}