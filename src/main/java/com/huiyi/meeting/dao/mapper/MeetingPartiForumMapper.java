package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingPartiForum;
import com.huiyi.meeting.dao.model.MeetingPartiForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingPartiForumMapper {
    long countByExample(MeetingPartiForumExample example);

    int deleteByExample(MeetingPartiForumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingPartiForum record);

    int insertSelective(MeetingPartiForum record);

    List<MeetingPartiForum> selectByExample(MeetingPartiForumExample example);

    MeetingPartiForum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingPartiForum record, @Param("example") MeetingPartiForumExample example);

    int updateByExample(@Param("record") MeetingPartiForum record, @Param("example") MeetingPartiForumExample example);

    int updateByPrimaryKeySelective(MeetingPartiForum record);

    int updateByPrimaryKey(MeetingPartiForum record);
}