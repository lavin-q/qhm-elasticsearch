package com.qhm.elasticsearch.controller;

import com.qhm.elasticsearch.entity.Device;
import com.qhm.elasticsearch.entity.IotHihModeRunData;
import com.qhm.elasticsearch.service.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @ Description:
 * @ Author: qhm
 * @ Date: 2020/3/18 10:54
 * @ Version: 1.0
 */
@Controller
public class DataBaseController {

    @Autowired
    private DataBaseService dataBaseService;

    @RequestMapping("/database/getbyid")
    public ResponseEntity selectByPrimaryKey(@RequestBody Map<String,Object> map){
        int id = Integer.parseInt(map.get("id").toString());
        Device device = this.dataBaseService.selectByPrimaryKey(id);
        return  ResponseEntity.ok(device);
    }

    @RequestMapping("/database/commander")
    public ResponseEntity commanderSelectByPrimaryKey(@RequestBody Map<String,Object> map){
        int id = Integer.parseInt(map.get("id").toString());
        IotHihModeRunData iotHihModeRunData = this.dataBaseService.selectHighModeByPrimaryKey(id);
        return  ResponseEntity.ok(iotHihModeRunData);
    }
}
