package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingParticipantRecipiantBatchTaskMapper;
import com.huiyi.meeting.dao.model.MeetingParticipantRecipiantBatchTask;
import com.huiyi.meeting.dao.model.MeetingParticipantRecipiantBatchTaskExample;
import com.huiyi.meeting.service.MeetingParticipantRecipiantBatchTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingParticipantRecipiantBatchTaskService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingParticipantRecipiantBatchTaskServiceImpl extends BaseServiceImpl<MeetingParticipantRecipiantBatchTaskMapper, MeetingParticipantRecipiantBatchTask, MeetingParticipantRecipiantBatchTaskExample> implements MeetingParticipantRecipiantBatchTaskService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingParticipantRecipiantBatchTaskServiceImpl.class);

    @Autowired
    MeetingParticipantRecipiantBatchTaskMapper meetingParticipantRecipiantBatchTaskMapper;

}