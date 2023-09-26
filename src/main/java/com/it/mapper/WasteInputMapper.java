package com.it.mapper;

import com.it.pojo.WasteInput;
import com.it.pojo.WasteInputExample;
import java.util.List;

import lombok.Data;
import org.apache.ibatis.annotations.Param;

public interface WasteInputMapper {
    long countByExample(WasteInputExample example);

    int deleteByExample(WasteInputExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WasteInput record);

    int insertSelective(WasteInput record);

    List<WasteInput> selectByExample(WasteInputExample example);

    WasteInput selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WasteInput record, @Param("example") WasteInputExample example);

    int updateByExample(@Param("record") WasteInput record, @Param("example") WasteInputExample example);

    int updateByPrimaryKeySelective(WasteInput record);

    int updateByPrimaryKey(WasteInput record);
}