package com.qhm.elasticsearch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = {"com.qhm.elasticsearch.mapper","com.qhm.elasticsearch.datasources.mapper1","com.qhm.elasticsearch.datasources.mapper2"})
public class ElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchApplication.class, args);
    }

}
