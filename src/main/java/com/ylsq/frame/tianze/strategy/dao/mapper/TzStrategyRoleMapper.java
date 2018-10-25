package com.ylsq.frame.tianze.strategy.dao.mapper;

import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyRole;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzStrategyRoleMapper {
    long countByExample(TzStrategyRoleExample example);

    int deleteByExample(TzStrategyRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzStrategyRole record);

    int insertSelective(TzStrategyRole record);

    List<TzStrategyRole> selectByExample(TzStrategyRoleExample example);

    TzStrategyRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzStrategyRole record, @Param("example") TzStrategyRoleExample example);

    int updateByExample(@Param("record") TzStrategyRole record, @Param("example") TzStrategyRoleExample example);

    int updateByPrimaryKeySelective(TzStrategyRole record);

    int updateByPrimaryKey(TzStrategyRole record);
}