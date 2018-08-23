package com.ylsq.frame.tianze.encrypt.dao.mapper;

import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptApplication;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzEncryptApplicationMapper {
    long countByExample(TzEncryptApplicationExample example);

    int deleteByExample(TzEncryptApplicationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzEncryptApplication record);

    int insertSelective(TzEncryptApplication record);

    List<TzEncryptApplication> selectByExample(TzEncryptApplicationExample example);

    TzEncryptApplication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzEncryptApplication record, @Param("example") TzEncryptApplicationExample example);

    int updateByExample(@Param("record") TzEncryptApplication record, @Param("example") TzEncryptApplicationExample example);

    int updateByPrimaryKeySelective(TzEncryptApplication record);

    int updateByPrimaryKey(TzEncryptApplication record);
}