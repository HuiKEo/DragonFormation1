package com.it.service;

import com.it.pojo.WasteInfo;
import com.it.pojo.WasteInput;

import java.util.List;

public interface WasteInputService {

    List<WasteInput> findAll(WasteInput wasteInput);
}
