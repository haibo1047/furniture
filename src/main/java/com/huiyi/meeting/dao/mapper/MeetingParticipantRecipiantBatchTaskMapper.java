package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingParticipantRecipiantBatchTask;
import com.huiyi.meeting.dao.model.MeetingParticipantRecipiantBatchTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingParticipantRecipiantBatchTaskMapper {
    long countByExample(MeetingParticipantRecipiantBatchTaskExample example);

    int deleteByExample(MeetingParticipantRecipiantBatchTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingParticipantRecipiantBatchTask record);

    int insertSelective(MeetingParticipantRecipiantBatchTask record);

    List<MeetingParticipantRecipiantBatchTask> selectByExample(MeetingParticipantRecipiantBatchTaskExample example);

    MeetingParticipantRecipiantBatchTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingParticipantRecipiantBatchTask record, @Param("example") MeetingParticipantRecipiantBatchTaskExample example);

    int updateByExample(@Param("record") MeetingParticipantRecipiantBatchTask record, @Param("example") MeetingParticipantRecipiantBatchTaskExample example);

    int updateByPrimaryKeySelective(MeetingParticipantRecipiantBatchTask record);

    int updateByPrimaryKey(MeetingParticipantRecipiantBatchTask record);
}