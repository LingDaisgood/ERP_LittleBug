package com.littlebug.dao;

import com.littlebug.bean.Final_MeasuretCheck;
import com.littlebug.bean.Final_MeasuretCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Final_MeasuretCheckMapper {
    long countByExample(Final_MeasuretCheckExample example);

    int deleteByExample(Final_MeasuretCheckExample example);

    int deleteByPrimaryKey(String fMeasureCheckId);

    int insert(Final_MeasuretCheck record);

    int insertSelective(Final_MeasuretCheck record);

    List<Final_MeasuretCheck> selectByExample(Final_MeasuretCheckExample example);

    Final_MeasuretCheck selectByPrimaryKey(String fMeasureCheckId);

    int updateByExampleSelective(@Param("record") Final_MeasuretCheck record, @Param("example") Final_MeasuretCheckExample example);

    int updateByExample(@Param("record") Final_MeasuretCheck record, @Param("example") Final_MeasuretCheckExample example);

    int updateByPrimaryKeySelective(Final_MeasuretCheck record);

    int updateByPrimaryKey(Final_MeasuretCheck record);
}