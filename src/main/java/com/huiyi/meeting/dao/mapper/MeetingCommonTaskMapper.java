package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingCommonTask;
import com.huiyi.meeting.dao.model.MeetingCommonTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingCommonTaskMapper {
    long countByExample(MeetingCommonTaskExample example);

    int deleteByExample(MeetingCommonTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingCommonTask record);

    int insertSelective(MeetingCommonTask record);

    List<MeetingCommonTask> selectByExample(MeetingCommonTaskExample example);

    MeetingCommonTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingCommonTask record, @Param("example") MeetingCommonTaskExample example);

    int updateByExample(@Param("record") MeetingCommonTask record, @Param("example") MeetingCommonTaskExample example);

    int updateByPrimaryKeySelective(MeetingCommonTask record);

    int updateByPrimaryKey(MeetingCommonTask record);
}