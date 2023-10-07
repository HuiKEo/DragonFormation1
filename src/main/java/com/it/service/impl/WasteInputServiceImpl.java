package com.it.service.impl;

import com.it.mapper.WasteInputMapper;
import com.it.pojo.WasteInfo;
import com.it.pojo.WasteInput;
import com.it.service.WasteInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteInputServiceImpl implements WasteInputService {

    @Autowired
    public WasteInputMapper wasteInputMapper;

    @Override
    public List<WasteInput> findAll(WasteInput wasteInput) {
        return this.wasteInputMapper.findAll(wasteInput);
    }
}
