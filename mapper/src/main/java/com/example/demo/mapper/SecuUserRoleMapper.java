package com.example.demo.mapper;

import com.example.demo.model.SecuUserRole;
import com.example.demo.model.SecuUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecuUserRoleMapper {
    long countByExample(SecuUserRoleExample example);

    int deleteByExample(SecuUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuUserRole row);

    int insertSelective(SecuUserRole row);

    List<SecuUserRole> selectByExample(SecuUserRoleExample example);

    SecuUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SecuUserRole row, @Param("example") SecuUserRoleExample example);

    int updateByExample(@Param("row") SecuUserRole row, @Param("example") SecuUserRoleExample example);

    int updateByPrimaryKeySelective(SecuUserRole row);

    int updateByPrimaryKey(SecuUserRole row);
}