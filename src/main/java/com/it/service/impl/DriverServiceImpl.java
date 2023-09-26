package com.it.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.mapper.DriverMapper;
import com.it.pojo.DispositionInfo;
import com.it.pojo.Driver;
import com.it.pojo.DriverExample;
import com.it.pojo.dto.DriverDto;
import com.it.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DriverService")
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverMapper driverMapper;
    @Override
    public PageInfo<Driver> getPageInfoCondition(DriverDto driverDto, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        DriverExample driverExample = new DriverExample();
        DriverExample.Criteria criteria = driverExample.createCriteria();
        criteria.andIsdeletedEqualTo(1);
        if (driverDto.getLicensePlate()!=null&&!("".equals(driverDto.getLicensePlate()))){
            criteria.andLicensePlateLike("%"+driverDto.getLicensePlate()+"%");
        }

        if (driverDto.getType()!=null&&!("".equals(driverDto.getType()))){
            criteria.andTypeLike("%"+driverDto.getType()+"%");
        }

        if (driverDto.getMeasure()!=null&&!("".equals(driverDto.getMeasure()))){
            criteria.andMeasureLike("%"+driverDto.getMeasure()+"%");
        }

        if (driverDto.getMinCapacity()!=null&&!("".equals(driverDto.getMinCapacity())&&
                driverDto.getMaxCapacity()!=null&&!("".equals(driverDto.getMaxCapacity()))))
        {
            criteria.andCapacityBetween(driverDto.getMinCapacity(),driverDto.getMaxCapacity());
        }

        if (driverDto.getMinCreateTime()!=null&&!("".equals(driverDto.getMinCreateTime())&&
                driverDto.getMaxCreateTime()!=null&&!("".equals(driverDto.getMaxCreateTime()))))
        {
            criteria.andCreateTimeBetween(driverDto.getMinCreateTime(),driverDto.getMaxCreateTime());
        }


        List<Driver> list = driverMapper.selectByExample(driverExample);
        PageInfo<Driver> pageInfo = new PageInfo<>(list, 5);
        return pageInfo;
    }

    @Override
    public Driver getDriverInfo(Integer id) {
        return driverMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateDriverInfo(Driver driver) {
        driverMapper.updateByPrimaryKeySelective(driver);
    }

    @Override
    public void deleteDriverInfo(Driver driver) {
        driverMapper.updateByPrimaryKeySelective(driver);
    }

    @Override
    public void addDriverInfo(Driver driver) {

        driverMapper.insertSelective(driver);
    }
}
