package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingPartiForumMapper;
import com.huiyi.meeting.dao.model.MeetingPartiForum;
import com.huiyi.meeting.dao.model.MeetingPartiForumExample;
import com.huiyi.meeting.service.MeetingPartiForumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingPartiForumService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingPartiForumServiceImpl extends BaseServiceImpl<MeetingPartiForumMapper, MeetingPartiForum, MeetingPartiForumExample> implements MeetingPartiForumService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingPartiForumServiceImpl.class);

    @Autowired
    MeetingPartiForumMapper meetingPartiForumMapper;

}