package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingStation;
import com.huiyi.meeting.dao.model.MeetingStationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingStationMapper {
    long countByExample(MeetingStationExample example);

    int deleteByExample(MeetingStationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingStation record);

    int insertSelective(MeetingStation record);

    List<MeetingStation> selectByExample(MeetingStationExample example);

    MeetingStation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingStation record, @Param("example") MeetingStationExample example);

    int updateByExample(@Param("record") MeetingStation record, @Param("example") MeetingStationExample example);

    int updateByPrimaryKeySelective(MeetingStation record);

    int updateByPrimaryKey(MeetingStation record);
}