package com.qhm.elasticsearch.datasources.config;

import com.qhm.elasticsearch.datasources.properties.DataBase1Properties;
import com.qhm.elasticsearch.datasources.properties.DataBase2Properties;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@Slf4j
public class DataSourceConfig {

    @Resource
    private DataBase1Properties dataBase1Properties;

    @Resource
    private DataBase2Properties dataBase2Properties;

    @Bean(name = "dataBase1DataSource")
    @Primary
    public DataSource dataBase1DataSource(){
        log.info("dataBase1DataSource初始化----111111");
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(dataBase1Properties.getUrl());
        dataSource.setUsername(dataBase1Properties.getUsername());
        dataSource.setPassword(dataBase1Properties.getPassword());
        dataSource.setDriverClassName(dataBase1Properties.getDriverClassName());
        return dataSource;
    }

    @Bean(name = "dataBase2DataSource")
    public DataSource dataBase2DataSource(){
        log.info("dataBase2DataSource初始化----222222");
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(dataBase2Properties.getUrl());
        dataSource.setUsername(dataBase2Properties.getUsername());
        dataSource.setPassword(dataBase2Properties.getPassword());
        dataSource.setDriverClassName(dataBase2Properties.getDriverClassName());
        return dataSource;
    }
}