package com.qhm.elasticsearch.datasources.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactoryDataBase1", // 配置连接工厂
        transactionManagerRef = "transactionManagerDatabase1", // 配置事物管理器
        basePackages = {"com.qhm.elasticsearch.datasources.mapper1"} // 设置dao所在位置

)
public class DataBase1Config {

    // 配置数据源
    @Autowired
    private DataSource dataBase1DataSource;

    @Primary
    @Bean(name = "entityManagerFactoryDataBase1")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryDataBase1(EntityManagerFactoryBuilder builder) {
        return builder
                // 设置数据源
                .dataSource(dataBase1DataSource)
                //设置实体类所在位置.扫描所有带有 @Entity 注解的类
                .packages("com.qhm.elasticsearch.datasources.entity")
                // Spring会将EntityManagerFactory注入到Repository之中.有了 EntityManagerFactory之后,
                // Repository就能用它来创建 EntityManager 了,然后 EntityManager 就可以针对数据库执行操作
                .persistenceUnit("database1PersistenceUnit")
                .build();

    }

    /**
     * 配置事物管理器
     *
     * @param builder
     * @return
     */
    @Bean(name = "transactionManagerDatabase1")
    PlatformTransactionManager transactionManagerDatabase1(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryDataBase1(builder).getObject());
    }
}