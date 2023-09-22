package com.it.service.impl;

import com.it.mapper.DispositionInfoMapper;
import com.it.pojo.DispositionInfo;
import com.it.service.DispositionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DispositionRegisterService")
public class DispositionInfoServiceImpl implements DispositionInfoService {
    @Autowired
    private DispositionInfoMapper dispositionInfoMapper;
    @Override
    public void insertDispositionInfo(DispositionInfo dispositionInfo) {
        dispositionInfoMapper.insertSelective(dispositionInfo);
    }
}
