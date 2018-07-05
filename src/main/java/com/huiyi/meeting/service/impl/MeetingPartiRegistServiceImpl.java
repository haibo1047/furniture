package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingPartiRegistMapper;
import com.huiyi.meeting.dao.model.MeetingPartiRegist;
import com.huiyi.meeting.dao.model.MeetingPartiRegistExample;
import com.huiyi.meeting.service.MeetingPartiRegistService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingPartiRegistService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingPartiRegistServiceImpl extends BaseServiceImpl<MeetingPartiRegistMapper, MeetingPartiRegist, MeetingPartiRegistExample> implements MeetingPartiRegistService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingPartiRegistServiceImpl.class);

    @Autowired
    MeetingPartiRegistMapper meetingPartiRegistMapper;

}