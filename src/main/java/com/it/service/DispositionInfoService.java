package com.it.service;

import com.github.pagehelper.PageInfo;
import com.it.pojo.DispositionInfo;
import com.it.pojo.DispositionInfoExample;
import com.it.pojo.dto.DispositionInfoDto;

import java.util.List;

public interface DispositionInfoService {


    //处置场商注册信息
    public void insertDispositionInfo(DispositionInfo dispositionInfo);


    //展示处置厂商信息+分页+条件查询
    PageInfo<DispositionInfo> getPageInfoCondition(DispositionInfoDto dispositionInfoDto,int pageNo, int pageSize);

    //删除处置厂商信息
    void deleteDispositionInfo(DispositionInfo dispositionInfo);


    //修改时获取对象
    DispositionInfo updategetInfo(Integer id);


    void updateDispositionInfo(DispositionInfo dispositionInfo);

/*    //处置厂商信息审核
    public void examineDisposition();*/

}
