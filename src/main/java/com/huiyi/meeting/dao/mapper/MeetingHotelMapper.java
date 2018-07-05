package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingHotel;
import com.huiyi.meeting.dao.model.MeetingHotelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingHotelMapper {
    long countByExample(MeetingHotelExample example);

    int deleteByExample(MeetingHotelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingHotel record);

    int insertSelective(MeetingHotel record);

    List<MeetingHotel> selectByExample(MeetingHotelExample example);

    MeetingHotel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingHotel record, @Param("example") MeetingHotelExample example);

    int updateByExample(@Param("record") MeetingHotel record, @Param("example") MeetingHotelExample example);

    int updateByPrimaryKeySelective(MeetingHotel record);

    int updateByPrimaryKey(MeetingHotel record);
}