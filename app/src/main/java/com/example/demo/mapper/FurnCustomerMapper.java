package com.example.demo.mapper;

import com.example.demo.model.FurnCustomer;
import com.example.demo.model.FurnCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FurnCustomerMapper {
    long countByExample(FurnCustomerExample example);

    int deleteByExample(FurnCustomerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FurnCustomer row);

    int insertSelective(FurnCustomer row);

    List<FurnCustomer> selectByExample(FurnCustomerExample example);

    FurnCustomer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") FurnCustomer row, @Param("example") FurnCustomerExample example);

    int updateByExample(@Param("row") FurnCustomer row, @Param("example") FurnCustomerExample example);

    int updateByPrimaryKeySelective(FurnCustomer row);

    int updateByPrimaryKey(FurnCustomer row);
}