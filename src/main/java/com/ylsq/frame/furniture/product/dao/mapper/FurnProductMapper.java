package com.ylsq.frame.furniture.product.dao.mapper;

import com.ylsq.frame.furniture.product.dao.model.FurnProduct;
import com.ylsq.frame.furniture.product.dao.model.FurnProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FurnProductMapper {
    long countByExample(FurnProductExample example);

    int deleteByExample(FurnProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FurnProduct record);

    int insertSelective(FurnProduct record);

    List<FurnProduct> selectByExample(FurnProductExample example);

    FurnProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FurnProduct record, @Param("example") FurnProductExample example);

    int updateByExample(@Param("record") FurnProduct record, @Param("example") FurnProductExample example);

    int updateByPrimaryKeySelective(FurnProduct record);

    int updateByPrimaryKey(FurnProduct record);
}