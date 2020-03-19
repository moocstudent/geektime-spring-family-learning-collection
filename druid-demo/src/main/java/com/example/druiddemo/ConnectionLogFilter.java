package com.example.druiddemo;

import com.alibaba.druid.filter.FilterChain;
import com.alibaba.druid.filter.FilterEventAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.ConnectionProxy;

import java.util.Properties;

@Slf4j
public class ConnectionLogFilter extends FilterEventAdapter {

    @Override
    public void connection_connectBefore(FilterChain chain, Properties info){
        log.info("BEFORE CONNECTION!");
    }

    public void connection_connectAfter(ConnectionProxy connection){
        log.info("AFTER CONNECTION!");
    }

}
