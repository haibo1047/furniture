package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingScriptmanual;
import com.huiyi.meeting.dao.model.MeetingScriptmanualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingScriptmanualMapper {
    long countByExample(MeetingScriptmanualExample example);

    int deleteByExample(MeetingScriptmanualExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingScriptmanual record);

    int insertSelective(MeetingScriptmanual record);

    List<MeetingScriptmanual> selectByExample(MeetingScriptmanualExample example);

    MeetingScriptmanual selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingScriptmanual record, @Param("example") MeetingScriptmanualExample example);

    int updateByExample(@Param("record") MeetingScriptmanual record, @Param("example") MeetingScriptmanualExample example);

    int updateByPrimaryKeySelective(MeetingScriptmanual record);

    int updateByPrimaryKey(MeetingScriptmanual record);
}