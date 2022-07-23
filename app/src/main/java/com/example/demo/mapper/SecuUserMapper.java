package com.example.demo.mapper;

import com.example.demo.model.SecuUser;
import com.example.demo.model.SecuUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecuUserMapper {
    long countByExample(SecuUserExample example);

    int deleteByExample(SecuUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuUser row);

    int insertSelective(SecuUser row);

    List<SecuUser> selectByExample(SecuUserExample example);

    SecuUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SecuUser row, @Param("example") SecuUserExample example);

    int updateByExample(@Param("row") SecuUser row, @Param("example") SecuUserExample example);

    int updateByPrimaryKeySelective(SecuUser row);

    int updateByPrimaryKey(SecuUser row);
}