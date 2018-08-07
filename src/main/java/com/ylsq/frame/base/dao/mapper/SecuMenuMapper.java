package com.ylsq.frame.base.dao.mapper;

import com.ylsq.frame.base.dao.model.SecuMenu;
import com.ylsq.frame.base.dao.model.SecuMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecuMenuMapper {
    long countByExample(SecuMenuExample example);

    int deleteByExample(SecuMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuMenu record);

    int insertSelective(SecuMenu record);

    List<SecuMenu> selectByExample(SecuMenuExample example);

    SecuMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecuMenu record, @Param("example") SecuMenuExample example);

    int updateByExample(@Param("record") SecuMenu record, @Param("example") SecuMenuExample example);

    int updateByPrimaryKeySelective(SecuMenu record);

    int updateByPrimaryKey(SecuMenu record);
}