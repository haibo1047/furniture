package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingForumMapper;
import com.huiyi.meeting.dao.model.MeetingForum;
import com.huiyi.meeting.dao.model.MeetingForumExample;
import com.huiyi.meeting.service.MeetingForumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingForumService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingForumServiceImpl extends BaseServiceImpl<MeetingForumMapper, MeetingForum, MeetingForumExample> implements MeetingForumService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingForumServiceImpl.class);

    @Autowired
    MeetingForumMapper meetingForumMapper;

}