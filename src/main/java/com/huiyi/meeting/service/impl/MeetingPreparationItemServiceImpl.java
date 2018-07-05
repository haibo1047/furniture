package com.huiyi.meeting.service.impl;

import com.ylsq.common.annotation.BaseService;
import com.ylsq.common.base.BaseServiceImpl;
import com.huiyi.meeting.dao.mapper.MeetingPreparationItemMapper;
import com.huiyi.meeting.dao.model.MeetingPreparationItem;
import com.huiyi.meeting.dao.model.MeetingPreparationItemExample;
import com.huiyi.meeting.service.MeetingPreparationItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* MeetingPreparationItemService实现
* Created by shuzheng on 2018/7/3.
*/
@Service
@Transactional
@BaseService
public class MeetingPreparationItemServiceImpl extends BaseServiceImpl<MeetingPreparationItemMapper, MeetingPreparationItem, MeetingPreparationItemExample> implements MeetingPreparationItemService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingPreparationItemServiceImpl.class);

    @Autowired
    MeetingPreparationItemMapper meetingPreparationItemMapper;

}