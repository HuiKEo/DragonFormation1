package com.it.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.mapper.DispositionInfoMapper;
import com.it.pojo.DispositionInfo;
import com.it.pojo.DispositionInfoExample;
import com.it.pojo.dto.DispositionInfoDto;
import com.it.service.DispositionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DispositionRegisterService")
public class DispositionInfoServiceImpl implements DispositionInfoService {
    @Autowired
    private DispositionInfoMapper dispositionInfoMapper;
    @Override
    public void insertDispositionInfo(DispositionInfo dispositionInfo) {
        dispositionInfoMapper.insertSelective(dispositionInfo);
    }

    @Override
    public PageInfo<DispositionInfo> getPageInfoCondition(DispositionInfoDto dispositionInfoDto,int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        DispositionInfoExample dispositionInfoExample = new DispositionInfoExample();
        DispositionInfoExample.Criteria criteria = dispositionInfoExample.createCriteria();
        criteria.andIsdeletedEqualTo(1);
        if (dispositionInfoDto.getName()!=null&&!("".equals(dispositionInfoDto.getName()))){
            criteria.andNameLike("%"+dispositionInfoDto.getName()+"%");
        }

        if (dispositionInfoDto.getLicence()!=null&&!("".equals(dispositionInfoDto.getLicence()))){
            criteria.andLicenceLike("%"+dispositionInfoDto.getLicence()+"%");
        }
        if (dispositionInfoDto.getStatus()!=null){
            criteria.andStatusEqualTo(dispositionInfoDto.getStatus());
        }
        if (dispositionInfoDto.getMinTime()!=null&&!("".equals(dispositionInfoDto.getMinTime()))
                &&dispositionInfoDto.getMaxTime()!=null&&!("".equals(dispositionInfoDto.getMaxTime()))
        ){
            criteria.andCreateTimeBetween(dispositionInfoDto.getMinTime(),dispositionInfoDto.getMaxTime());
        }
        if (dispositionInfoDto.getIsdeleted()!=null){
            criteria.andIsdeletedEqualTo(dispositionInfoDto.getIsdeleted());
        }
        List<DispositionInfo> list = dispositionInfoMapper.selectByExample(dispositionInfoExample);
        PageInfo<DispositionInfo> pageInfo = new PageInfo<>(list,5);
        return pageInfo;
    }

    @Override
    public void deleteDispositionInfo(DispositionInfo dispositionInfo) {
        dispositionInfoMapper.updateByPrimaryKeySelective(dispositionInfo);
    }



    @Override
    public DispositionInfo updategetInfo(Integer id) {
        return dispositionInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateDispositionInfo(DispositionInfo dispositionInfo) {
        dispositionInfoMapper.updateByPrimaryKeySelective(dispositionInfo);
    }


 /*   @Override
    public void examineDisposition() {
        dispositionInfoMapper.updateByExample();
    }*/
}
