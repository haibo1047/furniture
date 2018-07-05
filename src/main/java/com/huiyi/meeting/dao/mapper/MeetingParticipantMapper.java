package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingParticipant;
import com.huiyi.meeting.dao.model.MeetingParticipantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingParticipantMapper {
    long countByExample(MeetingParticipantExample example);

    int deleteByExample(MeetingParticipantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingParticipant record);

    int insertSelective(MeetingParticipant record);

    List<MeetingParticipant> selectByExample(MeetingParticipantExample example);

    MeetingParticipant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingParticipant record, @Param("example") MeetingParticipantExample example);

    int updateByExample(@Param("record") MeetingParticipant record, @Param("example") MeetingParticipantExample example);

    int updateByPrimaryKeySelective(MeetingParticipant record);

    int updateByPrimaryKey(MeetingParticipant record);
}