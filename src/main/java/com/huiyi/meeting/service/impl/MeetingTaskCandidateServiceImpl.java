package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingTaskCandidateMapper;
import com.huiyi.meeting.dao.model.MeetingTaskCandidate;
import com.huiyi.meeting.dao.model.MeetingTaskCandidateExample;
import com.huiyi.meeting.service.MeetingTaskCandidateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingTaskCandidateService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingTaskCandidateServiceImpl extends BaseServiceImpl<MeetingTaskCandidateMapper, MeetingTaskCandidate, MeetingTaskCandidateExample> implements MeetingTaskCandidateService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingTaskCandidateServiceImpl.class);

    @Autowired
    MeetingTaskCandidateMapper meetingTaskCandidateMapper;

}