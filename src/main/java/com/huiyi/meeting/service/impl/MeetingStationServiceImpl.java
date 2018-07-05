package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingStationMapper;
import com.huiyi.meeting.dao.model.MeetingStation;
import com.huiyi.meeting.dao.model.MeetingStationExample;
import com.huiyi.meeting.service.MeetingStationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingStationService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingStationServiceImpl extends BaseServiceImpl<MeetingStationMapper, MeetingStation, MeetingStationExample> implements MeetingStationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingStationServiceImpl.class);

    @Autowired
    MeetingStationMapper meetingStationMapper;

}