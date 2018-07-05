package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingTopicMapper;
import com.huiyi.meeting.dao.model.MeetingTopic;
import com.huiyi.meeting.dao.model.MeetingTopicExample;
import com.huiyi.meeting.service.MeetingTopicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingTopicService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingTopicServiceImpl extends BaseServiceImpl<MeetingTopicMapper, MeetingTopic, MeetingTopicExample> implements MeetingTopicService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingTopicServiceImpl.class);

    @Autowired
    MeetingTopicMapper meetingTopicMapper;

}