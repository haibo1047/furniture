package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingMeeting;
import com.huiyi.meeting.dao.model.MeetingMeetingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingMeetingMapper {
    long countByExample(MeetingMeetingExample example);

    int deleteByExample(MeetingMeetingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingMeeting record);

    int insertSelective(MeetingMeeting record);

    List<MeetingMeeting> selectByExample(MeetingMeetingExample example);

    MeetingMeeting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingMeeting record, @Param("example") MeetingMeetingExample example);

    int updateByExample(@Param("record") MeetingMeeting record, @Param("example") MeetingMeetingExample example);

    int updateByPrimaryKeySelective(MeetingMeeting record);

    int updateByPrimaryKey(MeetingMeeting record);
}