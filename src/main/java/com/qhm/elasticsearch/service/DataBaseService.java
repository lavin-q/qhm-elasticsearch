package com.qhm.elasticsearch.service;

import com.qhm.elasticsearch.entity.Device;
import com.qhm.elasticsearch.entity.IotHihModeRunData;
import org.springframework.stereotype.Service;

/**
 * @ Description:
 * @ Author: qhm
 * @ Date: 2020/3/18 10:54
 * @ Version: 1.0
 */

public interface DataBaseService {
    Device selectByPrimaryKey(Integer id);

    IotHihModeRunData selectHighModeByPrimaryKey(Integer id);
}
