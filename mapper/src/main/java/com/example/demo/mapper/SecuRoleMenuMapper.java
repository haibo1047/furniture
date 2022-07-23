package com.example.demo.mapper;

import com.example.demo.model.SecuRoleMenu;
import com.example.demo.model.SecuRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecuRoleMenuMapper {
    long countByExample(SecuRoleMenuExample example);

    int deleteByExample(SecuRoleMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuRoleMenu row);

    int insertSelective(SecuRoleMenu row);

    List<SecuRoleMenu> selectByExample(SecuRoleMenuExample example);

    SecuRoleMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SecuRoleMenu row, @Param("example") SecuRoleMenuExample example);

    int updateByExample(@Param("row") SecuRoleMenu row, @Param("example") SecuRoleMenuExample example);

    int updateByPrimaryKeySelective(SecuRoleMenu row);

    int updateByPrimaryKey(SecuRoleMenu row);
}