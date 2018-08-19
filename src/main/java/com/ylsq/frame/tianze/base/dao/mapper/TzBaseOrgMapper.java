package com.ylsq.frame.tianze.base.dao.mapper;

import com.ylsq.frame.tianze.base.dao.model.TzBaseOrg;
import com.ylsq.frame.tianze.base.dao.model.TzBaseOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzBaseOrgMapper {
    long countByExample(TzBaseOrgExample example);

    int deleteByExample(TzBaseOrgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzBaseOrg record);

    int insertSelective(TzBaseOrg record);

    List<TzBaseOrg> selectByExample(TzBaseOrgExample example);

    TzBaseOrg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzBaseOrg record, @Param("example") TzBaseOrgExample example);

    int updateByExample(@Param("record") TzBaseOrg record, @Param("example") TzBaseOrgExample example);

    int updateByPrimaryKeySelective(TzBaseOrg record);

    int updateByPrimaryKey(TzBaseOrg record);
}