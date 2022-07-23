package com.example.demo.mapper;

import com.example.demo.model.SecuRole;
import com.example.demo.model.SecuRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecuRoleMapper {
    long countByExample(SecuRoleExample example);

    int deleteByExample(SecuRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuRole row);

    int insertSelective(SecuRole row);

    List<SecuRole> selectByExample(SecuRoleExample example);

    SecuRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SecuRole row, @Param("example") SecuRoleExample example);

    int updateByExample(@Param("row") SecuRole row, @Param("example") SecuRoleExample example);

    int updateByPrimaryKeySelective(SecuRole row);

    int updateByPrimaryKey(SecuRole row);
}