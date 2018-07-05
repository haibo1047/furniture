package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingTaskCandidate;
import com.huiyi.meeting.dao.model.MeetingTaskCandidateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingTaskCandidateMapper {
    long countByExample(MeetingTaskCandidateExample example);

    int deleteByExample(MeetingTaskCandidateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingTaskCandidate record);

    int insertSelective(MeetingTaskCandidate record);

    List<MeetingTaskCandidate> selectByExample(MeetingTaskCandidateExample example);

    MeetingTaskCandidate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingTaskCandidate record, @Param("example") MeetingTaskCandidateExample example);

    int updateByExample(@Param("record") MeetingTaskCandidate record, @Param("example") MeetingTaskCandidateExample example);

    int updateByPrimaryKeySelective(MeetingTaskCandidate record);

    int updateByPrimaryKey(MeetingTaskCandidate record);
}