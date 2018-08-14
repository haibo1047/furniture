package com.ylsq.frame.sys.dao.mapper;

import com.ylsq.frame.sys.dao.model.SecuUser;
import com.ylsq.frame.sys.dao.model.SecuUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecuUserMapper {
    long countByExample(SecuUserExample example);

    int deleteByExample(SecuUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecuUser record);

    int insertSelective(SecuUser record);

    List<SecuUser> selectByExample(SecuUserExample example);

    SecuUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecuUser record, @Param("example") SecuUserExample example);

    int updateByExample(@Param("record") SecuUser record, @Param("example") SecuUserExample example);

    int updateByPrimaryKeySelective(SecuUser record);

    int updateByPrimaryKey(SecuUser record);
}