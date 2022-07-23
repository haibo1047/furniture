package com.example.demo.mapper;

import com.example.demo.model.FurnProduct;
import com.example.demo.model.FurnProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FurnProductMapper {
    long countByExample(FurnProductExample example);

    int deleteByExample(FurnProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FurnProduct row);

    int insertSelective(FurnProduct row);

    List<FurnProduct> selectByExample(FurnProductExample example);

    FurnProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") FurnProduct row, @Param("example") FurnProductExample example);

    int updateByExample(@Param("row") FurnProduct row, @Param("example") FurnProductExample example);

    int updateByPrimaryKeySelective(FurnProduct row);

    int updateByPrimaryKey(FurnProduct row);
}