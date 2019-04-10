package com.ylsq.frame.tianze.request.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.sys.base.service.SysLogService;
import com.ylsq.frame.tianze.request.cons.ApproveStatus;
import com.ylsq.frame.tianze.request.dao.mapper.TzRequestOutgoingMapper;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoing;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoingExample;
import com.ylsq.frame.tianze.request.service.TzRequestOutgoingService;

/**
* TzRequestOutgoingService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzRequestOutgoingServiceImpl extends BaseServiceImpl<TzRequestOutgoingMapper, TzRequestOutgoing, TzRequestOutgoingExample> implements TzRequestOutgoingService {

    private static final Logger log = LoggerFactory.getLogger(TzRequestOutgoingServiceImpl.class);

    @Autowired
    TzRequestOutgoingMapper tzRequestOutgoingMapper;
    
    @Autowired
    private SysLogService sysLogService;

	@Override
	public List<TzRequestOutgoing> selectMineForStartPage(String login, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		TzRequestOutgoingExample example = new TzRequestOutgoingExample();
		if(StringUtils.isNotBlank(login)) {
			log.debug("No login passed in.");
			example.createCriteria().andCreateUserEqualTo(login);
		}
		return selectByExampleForStartPage(example, pageNum, pageSize);
	}

	@Override
	public int countAllMine(String login) {
		// TODO Auto-generated method stub
		TzRequestOutgoingExample example = new TzRequestOutgoingExample();
		if(StringUtils.isNotBlank(login)) {
			log.debug("No login passed in.");
			example.createCriteria().andCreateUserEqualTo(login);
		}
		return countByExample(example);
	}

	@Override
	public List<TzRequestOutgoing> selectMyPendingForStartPage(String login, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		TzRequestOutgoingExample example = new TzRequestOutgoingExample();
		example.createCriteria().andApproveStatusEqualTo(ApproveStatus.PENDING);
		return selectByExampleForStartPage(example, pageNum, pageSize);
	}

	@Override
	public int countAllMyPending(String login) {
		// TODO Auto-generated method stub
		TzRequestOutgoingExample example = new TzRequestOutgoingExample();
		example.createCriteria().andApproveStatusEqualTo(ApproveStatus.PENDING);
		return countByExample(example);
	}

	@Override
	public int approve(String login, Long requestId) {
		// TODO Auto-generated method stub
		TzRequestOutgoing model = new TzRequestOutgoing();
		model.setId(requestId);
		model.setApproveStatus(ApproveStatus.APPROVED);
		int result = updateByPrimaryKeySelective(model);
		
		if(result > 0)
			sysLogService.doApprove(login, new Date(), "外发审批", requestId);
		
		return result;
	}

	@Override
	public int reject(String login, Long requestId) {
		// TODO Auto-generated method stub
		TzRequestOutgoing model = new TzRequestOutgoing();
		model.setId(requestId);
		model.setApproveStatus(ApproveStatus.REJECTED);
		int result = updateByPrimaryKeySelective(model);
		
		if(result > 0)
			sysLogService.doReject(login, new Date(), "外发审批", requestId);
		
		return result;
	}

}