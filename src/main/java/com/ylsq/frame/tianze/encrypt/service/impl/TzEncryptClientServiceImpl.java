package com.ylsq.frame.tianze.encrypt.service.impl;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.sys.base.service.SysBlobService;
import com.ylsq.frame.tianze.encrypt.dao.mapper.TzEncryptClientMapper;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptClient;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptClientExample;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptClientService;

/**
* TzEncryptClientService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzEncryptClientServiceImpl extends BaseServiceImpl<TzEncryptClientMapper, TzEncryptClient, TzEncryptClientExample> implements TzEncryptClientService {

    private static final Logger log = LoggerFactory.getLogger(TzEncryptClientServiceImpl.class);

    @Autowired
    TzEncryptClientMapper tzEncryptClientMapper;
    @Autowired
    private SysBlobService sysBlobService;

	@Override
	public boolean uploadClientFile(Long clientId, MultipartFile file) {
		// TODO Auto-generated method stub
		try {
			Long blobId = sysBlobService.insert(file.getBytes(),clientId);
			log.debug("data id" + blobId);
			TzEncryptClient client = new TzEncryptClient();
			client.setId(clientId);
			client.setClientSize(file.getSize());
			client.setBlobId(blobId);
			updateByPrimaryKeySelective(client);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(e.getMessage());
		}
		return false;
	}

}