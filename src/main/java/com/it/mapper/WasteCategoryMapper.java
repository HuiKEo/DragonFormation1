package com.it.mapper;

import com.it.pojo.WasteCategory;
import com.it.pojo.WasteCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WasteCategoryMapper {
    long countByExample(WasteCategoryExample example);

    int deleteByExample(WasteCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WasteCategory record);

    int insertSelective(WasteCategory record);

    List<WasteCategory> selectByExample(WasteCategoryExample example);

    WasteCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WasteCategory record, @Param("example") WasteCategoryExample example);

    int updateByExample(@Param("record") WasteCategory record, @Param("example") WasteCategoryExample example);

    int updateByPrimaryKeySelective(WasteCategory record);

    int updateByPrimaryKey(WasteCategory record);
}