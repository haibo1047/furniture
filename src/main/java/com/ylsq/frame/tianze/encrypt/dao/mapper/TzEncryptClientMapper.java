package com.ylsq.frame.tianze.encrypt.dao.mapper;

import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptClient;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzEncryptClientMapper {
    long countByExample(TzEncryptClientExample example);

    int deleteByExample(TzEncryptClientExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzEncryptClient record);

    int insertSelective(TzEncryptClient record);

    List<TzEncryptClient> selectByExample(TzEncryptClientExample example);

    TzEncryptClient selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzEncryptClient record, @Param("example") TzEncryptClientExample example);

    int updateByExample(@Param("record") TzEncryptClient record, @Param("example") TzEncryptClientExample example);

    int updateByPrimaryKeySelective(TzEncryptClient record);

    int updateByPrimaryKey(TzEncryptClient record);
}