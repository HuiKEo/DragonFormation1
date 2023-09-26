package com.it.service.impl;

import com.it.mapper.WasteInfoMapper;
import com.it.pojo.WasteInfo;
import com.it.service.WasteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WasteInfoServiceImpl implements WasteInfoService {

    @Autowired
    public WasteInfoMapper wasteInfoMapper;

    @Override
    public List<WasteInfo> findAll(WasteInfo wasteInfo) {
        return this.wasteInfoMapper.findAll(wasteInfo);
    }

    @Override
    public WasteInfo findOne(int id) {
        return this.wasteInfoMapper.findOne(id);
    }

    @Override
    public int updateInfo(WasteInfo wasteInfo) {
        return this.wasteInfoMapper.updateWasteInfo(wasteInfo);
    }

    @Override
    public int insertInfo(WasteInfo wasteInfo) {
        return this.wasteInfoMapper.insertWaste(wasteInfo);
    }
}
