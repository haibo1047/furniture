package com.ylsq.frame.tianze.strategy.dao.mapper;

import com.ylsq.frame.tianze.strategy.dao.model.TzStrategySoftware;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategySoftwareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzStrategySoftwareMapper {
    long countByExample(TzStrategySoftwareExample example);

    int deleteByExample(TzStrategySoftwareExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzStrategySoftware record);

    int insertSelective(TzStrategySoftware record);

    List<TzStrategySoftware> selectByExample(TzStrategySoftwareExample example);

    TzStrategySoftware selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzStrategySoftware record, @Param("example") TzStrategySoftwareExample example);

    int updateByExample(@Param("record") TzStrategySoftware record, @Param("example") TzStrategySoftwareExample example);

    int updateByPrimaryKeySelective(TzStrategySoftware record);

    int updateByPrimaryKey(TzStrategySoftware record);
}