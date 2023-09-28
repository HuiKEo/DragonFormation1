package com.it.mapper;

import com.it.pojo.WasteInfo;
import com.it.pojo.WasteInput;
import com.it.pojo.WasteInputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WasteInputMapper {

    List<WasteInfo> findAll(WasteInfo wasteInfo);
}