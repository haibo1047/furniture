package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingRoomMapper;
import com.huiyi.meeting.dao.model.MeetingRoom;
import com.huiyi.meeting.dao.model.MeetingRoomExample;
import com.huiyi.meeting.service.MeetingRoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingRoomService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingRoomServiceImpl extends BaseServiceImpl<MeetingRoomMapper, MeetingRoom, MeetingRoomExample> implements MeetingRoomService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingRoomServiceImpl.class);

    @Autowired
    MeetingRoomMapper meetingRoomMapper;

}