package com.example.demo.mapper;

import com.example.demo.model.FurnOrder;
import com.example.demo.model.FurnOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FurnOrderMapper {
    long countByExample(FurnOrderExample example);

    int deleteByExample(FurnOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FurnOrder row);

    int insertSelective(FurnOrder row);

    List<FurnOrder> selectByExample(FurnOrderExample example);

    FurnOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") FurnOrder row, @Param("example") FurnOrderExample example);

    int updateByExample(@Param("row") FurnOrder row, @Param("example") FurnOrderExample example);

    int updateByPrimaryKeySelective(FurnOrder row);

    int updateByPrimaryKey(FurnOrder row);
}