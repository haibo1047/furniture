package com.ylsq.frame.tianze.encrypt.service;

import org.springframework.web.multipart.MultipartFile;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptClient;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptClientExample;

/**
* TzEncryptClientService接口
* Created by harper
*/
public interface TzEncryptClientService extends BaseService<TzEncryptClient, TzEncryptClientExample> {

	/**
	 * 上传客户端
	 * @param clientId
	 * @param file
	 * @return
	 */
	public boolean uploadClientFile(Long clientId, MultipartFile file);
	
	
	/**
	 * 获取最新版本号
	 * @return
	 */
	public TzEncryptClient getLatestVersion();
	
}