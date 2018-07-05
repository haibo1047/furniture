package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingForum;
import com.huiyi.meeting.dao.model.MeetingForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingForumMapper {
    long countByExample(MeetingForumExample example);

    int deleteByExample(MeetingForumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingForum record);

    int insertSelective(MeetingForum record);

    List<MeetingForum> selectByExample(MeetingForumExample example);

    MeetingForum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingForum record, @Param("example") MeetingForumExample example);

    int updateByExample(@Param("record") MeetingForum record, @Param("example") MeetingForumExample example);

    int updateByPrimaryKeySelective(MeetingForum record);

    int updateByPrimaryKey(MeetingForum record);
}