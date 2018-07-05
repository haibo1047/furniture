package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingRegistMapper;
import com.huiyi.meeting.dao.model.MeetingRegist;
import com.huiyi.meeting.dao.model.MeetingRegistExample;
import com.huiyi.meeting.service.MeetingRegistService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingRegistService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingRegistServiceImpl extends BaseServiceImpl<MeetingRegistMapper, MeetingRegist, MeetingRegistExample> implements MeetingRegistService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingRegistServiceImpl.class);

    @Autowired
    MeetingRegistMapper meetingRegistMapper;

}