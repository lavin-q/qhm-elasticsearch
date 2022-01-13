package com.qhm.elasticsearch.datasources.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.database1")
@Component
@Data
public class DataBase1Properties {
    private String url;

    private String username;

    private String password;

    private String driverClassName;
}
