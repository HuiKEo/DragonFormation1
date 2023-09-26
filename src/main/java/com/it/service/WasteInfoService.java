package com.it.service;

import com.it.pojo.WasteInfo;

import java.util.List;

public interface WasteInfoService {

    List<WasteInfo> findAll(WasteInfo wasteInfo);

    WasteInfo findOne(int id);

    int updateInfo(WasteInfo wasteInfo);
}
