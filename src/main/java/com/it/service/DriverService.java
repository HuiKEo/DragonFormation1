package com.it.service;

import com.github.pagehelper.PageInfo;
import com.it.pojo.DispositionInfo;
import com.it.pojo.Driver;
import com.it.pojo.dto.DispositionInfoDto;
import com.it.pojo.dto.DriverDto;

public interface DriverService {


    //展示车辆信息+分页+条件查询
    PageInfo<Driver> getPageInfoCondition(DriverDto driverDto, int pageNo, int pageSize);

    //修改获取数据
    Driver getDriverInfo(Integer id);


    //修改数据
    void updateDriverInfo(Driver driver);

    //删除车辆信息（逻辑删除）
    void deleteDriverInfo(Driver driver);
}
