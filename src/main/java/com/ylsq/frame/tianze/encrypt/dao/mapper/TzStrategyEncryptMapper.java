package com.ylsq.frame.tianze.encrypt.dao.mapper;

import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyEncrypt;
import com.ylsq.frame.tianze.encrypt.dao.model.TzStrategyEncryptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzStrategyEncryptMapper {
    long countByExample(TzStrategyEncryptExample example);

    int deleteByExample(TzStrategyEncryptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzStrategyEncrypt record);

    int insertSelective(TzStrategyEncrypt record);

    List<TzStrategyEncrypt> selectByExample(TzStrategyEncryptExample example);

    TzStrategyEncrypt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzStrategyEncrypt record, @Param("example") TzStrategyEncryptExample example);

    int updateByExample(@Param("record") TzStrategyEncrypt record, @Param("example") TzStrategyEncryptExample example);

    int updateByPrimaryKeySelective(TzStrategyEncrypt record);

    int updateByPrimaryKey(TzStrategyEncrypt record);
}