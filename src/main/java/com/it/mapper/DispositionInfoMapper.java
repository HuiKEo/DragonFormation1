package com.it.mapper;

import com.it.pojo.DispositionInfo;
import com.it.pojo.DispositionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DispositionInfoMapper {
    long countByExample(DispositionInfoExample example);

    int deleteByExample(DispositionInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DispositionInfo record);

    int insertSelective(DispositionInfo record);

    List<DispositionInfo> selectByExample(DispositionInfoExample example);

    DispositionInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DispositionInfo record, @Param("example") DispositionInfoExample example);

    int updateByExample(@Param("record") DispositionInfo record, @Param("example") DispositionInfoExample example);

    int updateByPrimaryKeySelective(DispositionInfo record);

    int updateByPrimaryKey(DispositionInfo record);
}