package com.it.mapper;

import com.it.pojo.WasteInfo;
import com.it.pojo.WasteInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WasteInfoMapper {
    long countByExample(WasteInfoExample example);

    int deleteByExample(WasteInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WasteInfo record);

    int insertSelective(WasteInfo record);

    List<WasteInfo> selectByExample(WasteInfoExample example);

    WasteInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WasteInfo record, @Param("example") WasteInfoExample example);

    int updateByExample(@Param("record") WasteInfo record, @Param("example") WasteInfoExample example);

    int updateByPrimaryKeySelective(WasteInfo record);

    int updateByPrimaryKey(WasteInfo record);

    List<WasteInfo> findAll(WasteInfo wasteInfo);

    WasteInfo findOne(int id);

    int updateWasteInfo(WasteInfo wasteInfo);

    int insertWaste(WasteInfo wasteInfo);
}