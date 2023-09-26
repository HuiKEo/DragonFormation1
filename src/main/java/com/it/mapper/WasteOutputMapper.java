package com.it.mapper;

import com.it.pojo.WasteOutput;
import com.it.pojo.WasteOutputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WasteOutputMapper {
    long countByExample(WasteOutputExample example);

    int deleteByExample(WasteOutputExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WasteOutput record);

    int insertSelective(WasteOutput record);

    List<WasteOutput> selectByExample(WasteOutputExample example);

    WasteOutput selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WasteOutput record, @Param("example") WasteOutputExample example);

    int updateByExample(@Param("record") WasteOutput record, @Param("example") WasteOutputExample example);

    int updateByPrimaryKeySelective(WasteOutput record);

    int updateByPrimaryKey(WasteOutput record);
}