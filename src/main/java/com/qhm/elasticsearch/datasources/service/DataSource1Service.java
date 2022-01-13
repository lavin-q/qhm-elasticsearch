package com.qhm.elasticsearch.datasources.service;

import com.qhm.elasticsearch.datasources.entity.User;
import com.qhm.elasticsearch.datasources.mapper1.UserMapper1;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
//@Transactional
public class DataSource1Service {

    @Resource
    //@Qualifier("Data1UserMapper")
    private UserMapper1 userMapper1;

    public User query(){
        return this.userMapper1.selectByPrimaryKey(1l);
    }
}
