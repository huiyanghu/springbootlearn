package com.hhy.springbootlearn.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.proxy.DruidDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.beans.PropertyVetoException;
import java.sql.Driver;

/**
 * Created by hhy on 17/7/12.
 */
@Configuration
public class DBconfig {
    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DruidDataSource dataSource() throws PropertyVetoException {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
