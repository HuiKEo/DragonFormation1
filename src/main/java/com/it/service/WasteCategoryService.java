package com.it.service;

import com.it.pojo.WasteCategory;
import com.it.pojo.WasteCategoryExample;

import java.util.List;

public interface WasteCategoryService {

    long countByExample(WasteCategoryExample example);

    int deleteByExample(WasteCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WasteCategory record);

    int insertSelective(WasteCategory record);

    List<WasteCategory> selectByExample(WasteCategoryExample example);

    WasteCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(WasteCategory record, WasteCategoryExample example);

    int updateByExample(WasteCategory record, WasteCategoryExample example);

    int updateByPrimaryKeySelective(WasteCategory record);

    int updateByPrimaryKey(WasteCategory record);

    // 新增根据条件查询的方法
    List<WasteCategory> selectByCondition(String categoryName);
}
