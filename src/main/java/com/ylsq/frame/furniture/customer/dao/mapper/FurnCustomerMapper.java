package com.ylsq.frame.furniture.customer.dao.mapper;

import com.ylsq.frame.furniture.customer.dao.model.FurnCustomer;
import com.ylsq.frame.furniture.customer.dao.model.FurnCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FurnCustomerMapper {
    long countByExample(FurnCustomerExample example);

    int deleteByExample(FurnCustomerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FurnCustomer record);

    int insertSelective(FurnCustomer record);

    List<FurnCustomer> selectByExample(FurnCustomerExample example);

    FurnCustomer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FurnCustomer record, @Param("example") FurnCustomerExample example);

    int updateByExample(@Param("record") FurnCustomer record, @Param("example") FurnCustomerExample example);

    int updateByPrimaryKeySelective(FurnCustomer record);

    int updateByPrimaryKey(FurnCustomer record);
}