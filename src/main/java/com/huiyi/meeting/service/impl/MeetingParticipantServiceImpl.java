package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingParticipantMapper;
import com.huiyi.meeting.dao.model.MeetingParticipant;
import com.huiyi.meeting.dao.model.MeetingParticipantExample;
import com.huiyi.meeting.service.MeetingParticipantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingParticipantService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingParticipantServiceImpl extends BaseServiceImpl<MeetingParticipantMapper, MeetingParticipant, MeetingParticipantExample> implements MeetingParticipantService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingParticipantServiceImpl.class);

    @Autowired
    MeetingParticipantMapper meetingParticipantMapper;

}