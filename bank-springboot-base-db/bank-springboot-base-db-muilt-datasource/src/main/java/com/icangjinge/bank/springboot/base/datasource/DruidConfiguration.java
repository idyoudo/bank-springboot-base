package com.icangjinge.bank.springboot.base.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.sql.DataSource;


/**
 * druid 连接池配置类
 */
@Configuration
public class DruidConfiguration {
    private Logger logger = LoggerFactory.getLogger(DruidConfiguration.class) ;


    //声明其为Bean实例
    @Bean(name="writeDatasource")
    @Qualifier("writeDatasource")
    @ConfigurationProperties(prefix="spring.datasource.write")
    public DataSource writeDatasource(){
        return new DruidDataSource();
    }

    //声明其为Bean实例
    @Bean(name="readDatasource")
    @Qualifier("readDatasource")
    @ConfigurationProperties(prefix="spring.datasource.read")
    public DataSource readDatasource(){
        return new DruidDataSource();
    }

    @Bean(name="writeJdbcTemplate")
    public JdbcTemplate writeJdbcTemplate (@Qualifier("writeDatasource")  DataSource dataSource ) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name="readJdbcTemplate")
    public JdbcTemplate readJdbcTemplate (@Qualifier("readDatasource")  DataSource dataSource ) {
        return new JdbcTemplate(dataSource);
    }
}
