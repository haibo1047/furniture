package com.ylsq.frame.furniture.order.dao.mapper;

import com.ylsq.frame.furniture.order.dao.model.FurnOrder;
import com.ylsq.frame.furniture.order.dao.model.FurnOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FurnOrderMapper {
    long countByExample(FurnOrderExample example);

    int deleteByExample(FurnOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FurnOrder record);

    int insertSelective(FurnOrder record);

    List<FurnOrder> selectByExample(FurnOrderExample example);

    FurnOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FurnOrder record, @Param("example") FurnOrderExample example);

    int updateByExample(@Param("record") FurnOrder record, @Param("example") FurnOrderExample example);

    int updateByPrimaryKeySelective(FurnOrder record);

    int updateByPrimaryKey(FurnOrder record);
}