package com.potec.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pohoulong on 2018/1/12.
 */
@Configuration
@EnableConfigurationProperties
public class DruidConfig {
    /**
     * druid连接池配置参数
     *
     * @return the data source
     */
    @Bean(initMethod = "init")
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DruidDataSource getDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}
