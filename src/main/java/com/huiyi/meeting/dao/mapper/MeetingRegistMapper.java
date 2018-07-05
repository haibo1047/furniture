package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingRegist;
import com.huiyi.meeting.dao.model.MeetingRegistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingRegistMapper {
    long countByExample(MeetingRegistExample example);

    int deleteByExample(MeetingRegistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingRegist record);

    int insertSelective(MeetingRegist record);

    List<MeetingRegist> selectByExample(MeetingRegistExample example);

    MeetingRegist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingRegist record, @Param("example") MeetingRegistExample example);

    int updateByExample(@Param("record") MeetingRegist record, @Param("example") MeetingRegistExample example);

    int updateByPrimaryKeySelective(MeetingRegist record);

    int updateByPrimaryKey(MeetingRegist record);
}