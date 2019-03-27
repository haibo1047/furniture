package com.ylsq.frame.tianze.request.dao.mapper;

import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoing;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzRequestOutgoingMapper {
    long countByExample(TzRequestOutgoingExample example);

    int deleteByExample(TzRequestOutgoingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzRequestOutgoing record);

    int insertSelective(TzRequestOutgoing record);

    List<TzRequestOutgoing> selectByExample(TzRequestOutgoingExample example);

    TzRequestOutgoing selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzRequestOutgoing record, @Param("example") TzRequestOutgoingExample example);

    int updateByExample(@Param("record") TzRequestOutgoing record, @Param("example") TzRequestOutgoingExample example);

    int updateByPrimaryKeySelective(TzRequestOutgoing record);

    int updateByPrimaryKey(TzRequestOutgoing record);
}