package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingHotelMapper;
import com.huiyi.meeting.dao.model.MeetingHotel;
import com.huiyi.meeting.dao.model.MeetingHotelExample;
import com.huiyi.meeting.service.MeetingHotelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingHotelService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingHotelServiceImpl extends BaseServiceImpl<MeetingHotelMapper, MeetingHotel, MeetingHotelExample> implements MeetingHotelService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingHotelServiceImpl.class);

    @Autowired
    MeetingHotelMapper meetingHotelMapper;

}