package com.example.multidatasourcedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

/**
 * 多数据源
 * 2020-03-19 09:33:54.001  INFO 11276 --- [           main] c.e.m.MultiDataSourceConfig              : foo datasource: jdbc:h2:mem:foo
 * 2020-03-19 09:33:54.027  INFO 11276 --- [           main] c.e.m.MultiDataSourceConfig              : bar datasource: jdbc:h2:mem:bar
 * 其它:
 * https://blog.csdn.net/zxy_9264_ang/article/details/96829229
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        JdbcTemplateAutoConfiguration.class})
public class MultiDatasourceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiDatasourceDemoApplication.class, args);
    }

}
