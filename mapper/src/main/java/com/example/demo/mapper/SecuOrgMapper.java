package com.example.demo.mapper;

import com.example.demo.model.SecuOrg;
import com.example.demo.model.SecuOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecuOrgMapper {
    long countByExample(SecuOrgExample example);

    int deleteByExample(SecuOrgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuOrg row);

    int insertSelective(SecuOrg row);

    List<SecuOrg> selectByExample(SecuOrgExample example);

    SecuOrg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SecuOrg row, @Param("example") SecuOrgExample example);

    int updateByExample(@Param("row") SecuOrg row, @Param("example") SecuOrgExample example);

    int updateByPrimaryKeySelective(SecuOrg row);

    int updateByPrimaryKey(SecuOrg row);
}