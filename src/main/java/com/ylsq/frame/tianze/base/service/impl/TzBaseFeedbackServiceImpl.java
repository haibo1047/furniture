package com.ylsq.frame.tianze.base.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.base.dao.mapper.TzBaseFeedbackMapper;
import com.ylsq.frame.tianze.base.dao.model.TzBaseFeedback;
import com.ylsq.frame.tianze.base.dao.model.TzBaseFeedbackExample;
import com.ylsq.frame.tianze.base.service.TzBaseFeedbackService;

/**
* TzBaseFeedbackService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzBaseFeedbackServiceImpl extends BaseServiceImpl<TzBaseFeedbackMapper, TzBaseFeedback, TzBaseFeedbackExample> implements TzBaseFeedbackService {

    private static final Logger log = LoggerFactory.getLogger(TzBaseFeedbackServiceImpl.class);

    @Autowired
    TzBaseFeedbackMapper tzBaseFeedbackMapper;

	@Override
	public int initFeedback(String userName, String feedback) {
		// TODO Auto-generated method stub
		TzBaseFeedback model = new TzBaseFeedback();
		model.setLoginId(userName);
		model.setFeedback(feedback);
		model.setCreateTime(new Date());
		model.setCreateUser(userName);
		model.setRecStatus(TzBaseFeedback.recStatus_valid);
		return insert(model);
	}

}