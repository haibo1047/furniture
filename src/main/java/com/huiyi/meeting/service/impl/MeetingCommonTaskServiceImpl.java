package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingCommonTaskMapper;
import com.huiyi.meeting.dao.model.MeetingCommonTask;
import com.huiyi.meeting.dao.model.MeetingCommonTaskExample;
import com.huiyi.meeting.service.MeetingCommonTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingCommonTaskService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingCommonTaskServiceImpl extends BaseServiceImpl<MeetingCommonTaskMapper, MeetingCommonTask, MeetingCommonTaskExample> implements MeetingCommonTaskService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingCommonTaskServiceImpl.class);

    @Autowired
    MeetingCommonTaskMapper meetingCommonTaskMapper;

}