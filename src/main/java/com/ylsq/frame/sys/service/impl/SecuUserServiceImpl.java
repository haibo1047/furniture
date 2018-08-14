package com.ylsq.frame.sys.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.sys.dao.mapper.SecuUserMapper;
import com.ylsq.frame.sys.dao.model.SecuUser;
import com.ylsq.frame.sys.dao.model.SecuUserExample;
import com.ylsq.frame.sys.service.SecuUserService;

/**
* SecuUserService实现
* Created by shuzheng on 2018/7/26.
*/
@Service
@Transactional
@BaseService
public class SecuUserServiceImpl extends BaseServiceImpl<SecuUserMapper, SecuUser, SecuUserExample> implements SecuUserService {

    private static final Logger log = LoggerFactory.getLogger(SecuUserServiceImpl.class);

    @Autowired
    SecuUserMapper secuUserMapper;

	@Override
	public SecuUser selectByUsername(String username) {
		// TODO Auto-generated method stub
		SecuUserExample example = new SecuUserExample();
		example.createCriteria().andUserNameEqualTo(username);
		List<SecuUser> users = selectByExample(example);
		if(users.size()>0) {
			log.debug("users: "+ users.size());
			return users.get(0);
		}
		return null;
	}

}