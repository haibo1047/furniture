package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingMeetingMapper;
import com.huiyi.meeting.dao.model.MeetingMeeting;
import com.huiyi.meeting.dao.model.MeetingMeetingExample;
import com.huiyi.meeting.service.MeetingMeetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingMeetingService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingMeetingServiceImpl extends BaseServiceImpl<MeetingMeetingMapper, MeetingMeeting, MeetingMeetingExample> implements MeetingMeetingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingMeetingServiceImpl.class);

    @Autowired
    MeetingMeetingMapper meetingMeetingMapper;

}