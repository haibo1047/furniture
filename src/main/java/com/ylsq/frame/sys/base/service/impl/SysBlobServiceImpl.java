package com.ylsq.frame.sys.base.service.impl;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.sys.base.dao.mapper.SysBlobMapper;
import com.ylsq.frame.sys.base.dao.model.SysBlob;
import com.ylsq.frame.sys.base.dao.model.SysBlobExample;
import com.ylsq.frame.sys.base.service.SysBlobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* SysBlobService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class SysBlobServiceImpl extends BaseServiceImpl<SysBlobMapper, SysBlob, SysBlobExample> implements SysBlobService {

    private static final Logger log = LoggerFactory.getLogger(SysBlobServiceImpl.class);

    @Autowired
    SysBlobMapper sysBlobMapper;

	@Override
	public Long insert(byte[] bytes) {
		// TODO Auto-generated method stub
		SysBlob sb = new SysBlob();
		sb.setData(bytes);
		int cnt = sysBlobMapper.insert(sb);
		log.debug("blob: " + cnt);
		return sb.getBlobId();
	}

}