package com.huiyi.meeting.dao.mapper;

import com.huiyi.meeting.dao.model.MeetingPartiRegist;
import com.huiyi.meeting.dao.model.MeetingPartiRegistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingPartiRegistMapper {
    long countByExample(MeetingPartiRegistExample example);

    int deleteByExample(MeetingPartiRegistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingPartiRegist record);

    int insertSelective(MeetingPartiRegist record);

    List<MeetingPartiRegist> selectByExample(MeetingPartiRegistExample example);

    MeetingPartiRegist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeetingPartiRegist record, @Param("example") MeetingPartiRegistExample example);

    int updateByExample(@Param("record") MeetingPartiRegist record, @Param("example") MeetingPartiRegistExample example);

    int updateByPrimaryKeySelective(MeetingPartiRegist record);

    int updateByPrimaryKey(MeetingPartiRegist record);
}