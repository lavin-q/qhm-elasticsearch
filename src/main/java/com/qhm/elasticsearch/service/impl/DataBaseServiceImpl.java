package com.qhm.elasticsearch.service.impl;

import com.qhm.elasticsearch.entity.Device;
import com.qhm.elasticsearch.entity.IotHihModeRunData;
import com.qhm.elasticsearch.mapper.DeviceMapper;
import com.qhm.elasticsearch.mapper.IotHihModeRunDataMapper;
import com.qhm.elasticsearch.service.DataBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ Description:
 * @ Author: qhm
 * @ Date: 2020/3/18 10:58
 * @ Version: 1.0
 */
@Service
public class DataBaseServiceImpl implements DataBaseService {

    @Resource
    private DeviceMapper deviceMapper;
    @Resource
    private IotHihModeRunDataMapper iotHihModeRunDataMapper;

    @Override
    public Device selectByPrimaryKey(Integer id) {
        return this.deviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public IotHihModeRunData selectHighModeByPrimaryKey(Integer id) {
        IotHihModeRunData iotHihModeRunData = this.iotHihModeRunDataMapper.selectByPrimaryKey(id);
        return iotHihModeRunData;
    }
}
