package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingPreparationItem;
import com.huiyi.meeting.dao.model.MeetingPreparationItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingPreparationItemMapper {
    long countByExample(MeetingPreparationItemExample example);

    int deleteByExample(MeetingPreparationItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingPreparationItem record);

    int insertSelective(MeetingPreparationItem record);

    List<MeetingPreparationItem> selectByExample(MeetingPreparationItemExample example);

    MeetingPreparationItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingPreparationItem record, @Param("example") MeetingPreparationItemExample example);

    int updateByExample(@Param("record") MeetingPreparationItem record, @Param("example") MeetingPreparationItemExample example);

    int updateByPrimaryKeySelective(MeetingPreparationItem record);

    int updateByPrimaryKey(MeetingPreparationItem record);
}