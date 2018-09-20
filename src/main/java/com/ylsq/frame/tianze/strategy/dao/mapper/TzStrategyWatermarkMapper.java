package com.ylsq.frame.tianze.strategy.dao.mapper;

import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermark;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzStrategyWatermarkMapper {
    long countByExample(TzStrategyWatermarkExample example);

    int deleteByExample(TzStrategyWatermarkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzStrategyWatermark record);

    int insertSelective(TzStrategyWatermark record);

    List<TzStrategyWatermark> selectByExample(TzStrategyWatermarkExample example);

    TzStrategyWatermark selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzStrategyWatermark record, @Param("example") TzStrategyWatermarkExample example);

    int updateByExample(@Param("record") TzStrategyWatermark record, @Param("example") TzStrategyWatermarkExample example);

    int updateByPrimaryKeySelective(TzStrategyWatermark record);

    int updateByPrimaryKey(TzStrategyWatermark record);
}