package com.ylsq.frame.tianze.encrypt.dao.mapper;

import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminal;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzEncryptTerminalMapper {
    long countByExample(TzEncryptTerminalExample example);

    int deleteByExample(TzEncryptTerminalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzEncryptTerminal record);

    int insertSelective(TzEncryptTerminal record);

    List<TzEncryptTerminal> selectByExample(TzEncryptTerminalExample example);

    TzEncryptTerminal selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzEncryptTerminal record, @Param("example") TzEncryptTerminalExample example);

    int updateByExample(@Param("record") TzEncryptTerminal record, @Param("example") TzEncryptTerminalExample example);

    int updateByPrimaryKeySelective(TzEncryptTerminal record);

    int updateByPrimaryKey(TzEncryptTerminal record);
}