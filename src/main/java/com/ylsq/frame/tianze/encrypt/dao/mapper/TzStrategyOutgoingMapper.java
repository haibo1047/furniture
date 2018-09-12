package com.ylsq.frame.tianze.encrypt.dao.mapper;

import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyOutgoing;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyOutgoingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzStrategyOutgoingMapper {
    long countByExample(TzStrategyOutgoingExample example);

    int deleteByExample(TzStrategyOutgoingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzStrategyOutgoing record);

    int insertSelective(TzStrategyOutgoing record);

    List<TzStrategyOutgoing> selectByExample(TzStrategyOutgoingExample example);

    TzStrategyOutgoing selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzStrategyOutgoing record, @Param("example") TzStrategyOutgoingExample example);

    int updateByExample(@Param("record") TzStrategyOutgoing record, @Param("example") TzStrategyOutgoingExample example);

    int updateByPrimaryKeySelective(TzStrategyOutgoing record);

    int updateByPrimaryKey(TzStrategyOutgoing record);
}