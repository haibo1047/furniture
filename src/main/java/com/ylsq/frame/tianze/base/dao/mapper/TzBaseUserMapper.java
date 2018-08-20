package com.ylsq.frame.tianze.base.dao.mapper;

import com.ylsq.frame.tianze.base.dao.model.TzBaseUser;
import com.ylsq.frame.tianze.base.dao.model.TzBaseUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzBaseUserMapper {
    long countByExample(TzBaseUserExample example);

    int deleteByExample(TzBaseUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzBaseUser record);

    int insertSelective(TzBaseUser record);

    List<TzBaseUser> selectByExample(TzBaseUserExample example);

    TzBaseUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzBaseUser record, @Param("example") TzBaseUserExample example);

    int updateByExample(@Param("record") TzBaseUser record, @Param("example") TzBaseUserExample example);

    int updateByPrimaryKeySelective(TzBaseUser record);

    int updateByPrimaryKey(TzBaseUser record);
}