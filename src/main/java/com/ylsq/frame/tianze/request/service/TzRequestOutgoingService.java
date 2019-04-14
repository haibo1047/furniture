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
	
	/**
	 * 自己发出请求数量
	 * @param login
	 * @return
	 */
	public int countAllMine(String login);
	
	/**
	 * 查询我发出的请求
	 * @param login
	 * @return
	 */
	public List<TzRequestOutgoing> selectMine(String login);
	
	/**
	 * 根据ID查
	 * @param requestId
	 * @return
	 */
	public TzRequestOutgoing getInfo(Long requestId);
	
	
	/**
	 * 查询等待用户审批的外发请求
	 * @param login
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public List<TzRequestOutgoing> selectMyPendingForStartPage(String login,int pageNum, int pageSize);
	
	/**
	 * 查询所有待审批列表
	 * @param login
	 * @return
	 */
	public List<TzRequestOutgoing> selectMyPending(String login);
	
	/**
	 * 等待我审批的
	 * @param login
	 * @return
	 */
	public int countAllMyPending(String login);
	
	
	/**
	 * 审批通过
	 * @param login
	 * @param requestId
	 * @return
	 */
	public int approve(String login, Long requestId);
	
	/**
	 * 驳回
	 * @param login
	 * @param requestId
	 * @return
	 */
	public int reject(String login, Long requestId);
}