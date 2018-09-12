package com.ylsq.frame.tianze.encrypt.dao.mapper;

import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyUser;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzStrategyUserMapper {
    long countByExample(TzStrategyUserExample example);

    int deleteByExample(TzStrategyUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzStrategyUser record);

    int insertSelective(TzStrategyUser record);

    List<TzStrategyUser> selectByExample(TzStrategyUserExample example);

    TzStrategyUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzStrategyUser record, @Param("example") TzStrategyUserExample example);

    int updateByExample(@Param("record") TzStrategyUser record, @Param("example") TzStrategyUserExample example);

    int updateByPrimaryKeySelective(TzStrategyUser record);

    int updateByPrimaryKey(TzStrategyUser record);
}