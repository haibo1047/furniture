package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingScriptmanualMapper;
import com.huiyi.meeting.dao.model.MeetingScriptmanual;
import com.huiyi.meeting.dao.model.MeetingScriptmanualExample;
import com.huiyi.meeting.service.MeetingScriptmanualService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingScriptmanualService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingScriptmanualServiceImpl extends BaseServiceImpl<MeetingScriptmanualMapper, MeetingScriptmanual, MeetingScriptmanualExample> implements MeetingScriptmanualService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingScriptmanualServiceImpl.class);

    @Autowired
    MeetingScriptmanualMapper meetingScriptmanualMapper;

}