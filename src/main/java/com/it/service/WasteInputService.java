package com.it.service;

import com.it.pojo.WasteInfo;

import java.util.List;

public interface WasteInputService {

    List<WasteInfo> findAll(WasteInfo wasteInfo);

    WasteInfo findOne(int id);

    int updateInputData(WasteInfo wasteInfo);

    int insertInputData(WasteInfo wasteInfo);
}
