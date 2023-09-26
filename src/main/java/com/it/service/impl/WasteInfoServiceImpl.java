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
}
