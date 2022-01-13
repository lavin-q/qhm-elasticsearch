package com.qhm.elasticsearch.datasources.service;

import com.qhm.elasticsearch.datasources.entity.User;
import com.qhm.elasticsearch.datasources.mapper2.UserMapper2;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
//@Transactional
public class DataSource2Service {

    @Resource
    private UserMapper2 userMapper2;

    public User query(){
        return this.userMapper2.selectByPrimaryKey(1l);
    }
}
