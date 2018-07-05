package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingStatementMapper;
import com.huiyi.meeting.dao.model.MeetingStatement;
import com.huiyi.meeting.dao.model.MeetingStatementExample;
import com.huiyi.meeting.service.MeetingStatementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingStatementService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingStatementServiceImpl extends BaseServiceImpl<MeetingStatementMapper, MeetingStatement, MeetingStatementExample> implements MeetingStatementService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingStatementServiceImpl.class);

    @Autowired
    MeetingStatementMapper meetingStatementMapper;

}