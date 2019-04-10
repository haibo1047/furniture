package com.ylsq.frame.tianze.request.service;

import java.util.List;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoing;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoingExample;

/**
* TzRequestOutgoingService接口
* Created by harper
*/
public interface TzRequestOutgoingService extends BaseService<TzRequestOutgoing, TzRequestOutgoingExample> {

	/**
	 * 分页查询自己发出的请求
	 * @param login
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public List<TzRequestOutgoing> selectMineForStartPage(String login,int pageNum, int pageSize);
}