package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingStatement;
import com.huiyi.meeting.dao.model.MeetingStatementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingStatementMapper {
    long countByExample(MeetingStatementExample example);

    int deleteByExample(MeetingStatementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingStatement record);

    int insertSelective(MeetingStatement record);

    List<MeetingStatement> selectByExample(MeetingStatementExample example);

    MeetingStatement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingStatement record, @Param("example") MeetingStatementExample example);

    int updateByExample(@Param("record") MeetingStatement record, @Param("example") MeetingStatementExample example);

    int updateByPrimaryKeySelective(MeetingStatement record);

    int updateByPrimaryKey(MeetingStatement record);
}