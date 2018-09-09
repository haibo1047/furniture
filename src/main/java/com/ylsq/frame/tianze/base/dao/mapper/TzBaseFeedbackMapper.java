package com.ylsq.frame.tianze.base.dao.mapper;

import com.ylsq.frame.tianze.base.dao.model.TzBaseFeedback;
import com.ylsq.frame.tianze.base.dao.model.TzBaseFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzBaseFeedbackMapper {
    long countByExample(TzBaseFeedbackExample example);

    int deleteByExample(TzBaseFeedbackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TzBaseFeedback record);

    int insertSelective(TzBaseFeedback record);

    List<TzBaseFeedback> selectByExample(TzBaseFeedbackExample example);

    TzBaseFeedback selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TzBaseFeedback record, @Param("example") TzBaseFeedbackExample example);

    int updateByExample(@Param("record") TzBaseFeedback record, @Param("example") TzBaseFeedbackExample example);

    int updateByPrimaryKeySelective(TzBaseFeedback record);

    int updateByPrimaryKey(TzBaseFeedback record);
}