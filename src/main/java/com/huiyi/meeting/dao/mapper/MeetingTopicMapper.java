package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingTopic;
import com.huiyi.meeting.dao.model.MeetingTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingTopicMapper {
    long countByExample(MeetingTopicExample example);

    int deleteByExample(MeetingTopicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingTopic record);

    int insertSelective(MeetingTopic record);

    List<MeetingTopic> selectByExample(MeetingTopicExample example);

    MeetingTopic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingTopic record, @Param("example") MeetingTopicExample example);

    int updateByExample(@Param("record") MeetingTopic record, @Param("example") MeetingTopicExample example);

    int updateByPrimaryKeySelective(MeetingTopic record);

    int updateByPrimaryKey(MeetingTopic record);
}