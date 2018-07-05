package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingParticipantRecipiantTaskMapper;
import com.huiyi.meeting.dao.model.MeetingParticipantRecipiantTask;
import com.huiyi.meeting.dao.model.MeetingParticipantRecipiantTaskExample;
import com.huiyi.meeting.service.MeetingParticipantRecipiantTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingParticipantRecipiantTaskService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingParticipantRecipiantTaskServiceImpl extends BaseServiceImpl<MeetingParticipantRecipiantTaskMapper, MeetingParticipantRecipiantTask, MeetingParticipantRecipiantTaskExample> implements MeetingParticipantRecipiantTaskService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingParticipantRecipiantTaskServiceImpl.class);

    @Autowired
    MeetingParticipantRecipiantTaskMapper meetingParticipantRecipiantTaskMapper;

}