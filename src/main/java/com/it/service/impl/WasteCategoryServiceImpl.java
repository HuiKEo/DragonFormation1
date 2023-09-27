package com.it.service.impl;

import com.it.mapper.WasteCategoryMapper;
import com.it.pojo.WasteCategory;
import com.it.pojo.WasteCategoryExample;
import com.it.service.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteCategoryServiceImpl implements WasteCategoryService {

    private final WasteCategoryMapper wasteCategoryMapper;

    @Autowired
    public WasteCategoryServiceImpl(WasteCategoryMapper wasteCategoryMapper) {
        this.wasteCategoryMapper = wasteCategoryMapper;
    }

    @Override
    public long countByExample(WasteCategoryExample example) {
        return wasteCategoryMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(WasteCategoryExample example) {
        return wasteCategoryMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return wasteCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(WasteCategory record) {
        return wasteCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(WasteCategory record) {
        return wasteCategoryMapper.insertSelective(record);
    }

    @Override
    public List<WasteCategory> selectByExample(WasteCategoryExample example) {
        return wasteCategoryMapper.selectByExample(example);
    }

    @Override
    public WasteCategory selectByPrimaryKey(Integer id) {
        return wasteCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(WasteCategory record, WasteCategoryExample example) {
        return wasteCategoryMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(WasteCategory record, WasteCategoryExample example) {
        return wasteCategoryMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(WasteCategory record) {
        return wasteCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WasteCategory record) {
        return wasteCategoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<WasteCategory> selectByCondition(String categoryName) {
        // 构建一个条件示例
        WasteCategoryExample example = new WasteCategoryExample();
        WasteCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryNameEqualTo(categoryName);

        return wasteCategoryMapper.selectByExample(example);
    }
}
