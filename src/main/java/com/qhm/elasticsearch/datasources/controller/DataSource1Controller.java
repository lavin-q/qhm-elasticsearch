package com.qhm.elasticsearch.datasources.controller;


import com.qhm.elasticsearch.datasources.service.DataSource1Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/data1")
public class DataSource1Controller {

    @Resource
    private DataSource1Service dataSource1Service;


    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public Object query(){
        return this.dataSource1Service.query();
    }
}
