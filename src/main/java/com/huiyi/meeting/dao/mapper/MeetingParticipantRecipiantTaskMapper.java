package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingParticipantRecipiantTask;
import com.huiyi.meeting.dao.model.MeetingParticipantRecipiantTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingParticipantRecipiantTaskMapper {
    long countByExample(MeetingParticipantRecipiantTaskExample example);

    int deleteByExample(MeetingParticipantRecipiantTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingParticipantRecipiantTask record);

    int insertSelective(MeetingParticipantRecipiantTask record);

    List<MeetingParticipantRecipiantTask> selectByExample(MeetingParticipantRecipiantTaskExample example);

    MeetingParticipantRecipiantTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingParticipantRecipiantTask record, @Param("example") MeetingParticipantRecipiantTaskExample example);

    int updateByExample(@Param("record") MeetingParticipantRecipiantTask record, @Param("example") MeetingParticipantRecipiantTaskExample example);

    int updateByPrimaryKeySelective(MeetingParticipantRecipiantTask record);

    int updateByPrimaryKey(MeetingParticipantRecipiantTask record);
}