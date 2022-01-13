package com.qhm.elasticsearch.datasources.controller;

import com.qhm.elasticsearch.datasources.service.DataSource2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/data2")
public class DataSource2Controller {

    @Resource
    private DataSource2Service dataSource2Service;

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public Object query(){
        return this.dataSource2Service.query();
    }

}
