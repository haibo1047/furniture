package com.example.demo.mapper;

import com.example.demo.model.SecuMenu;
import com.example.demo.model.SecuMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecuMenuMapper {
    long countByExample(SecuMenuExample example);

    int deleteByExample(SecuMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuMenu row);

    int insertSelective(SecuMenu row);

    List<SecuMenu> selectByExample(SecuMenuExample example);

    SecuMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SecuMenu row, @Param("example") SecuMenuExample example);

    int updateByExample(@Param("row") SecuMenu row, @Param("example") SecuMenuExample example);

    int updateByPrimaryKeySelective(SecuMenu row);

    int updateByPrimaryKey(SecuMenu row);
}