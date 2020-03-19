package com.example.programmatictransactiondemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLTransactionRollbackException;

@Service
@Slf4j
public class FooServiceImpl implements FooService{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional
    public void insertRecord() {
        jdbcTemplate.execute("INSERT INTO FOO (BAR) VALUES ('AAA')");
        log.info("insertRecord 'AAA'");
    }

    @Override
    @Transactional(rollbackFor = SQLTransactionRollbackException.class)
    public void insertThenRollback() throws SQLTransactionRollbackException {
        jdbcTemplate.execute("INSERT INTO FOO (BAR) VALUES ('BBB')");
        log.info("insertThenRollback 'BBB'");
        throw new SQLTransactionRollbackException();
    }

    /**
     * 不会触发事务
     * @throws SQLTransactionRollbackException
     */
    @Override
    //如果使用这个注解将会起效
    //@Transactional(rollbackFor = SQLTransactionRollbackException.class)
    public void invokeInsertThenRollback() throws SQLTransactionRollbackException {
        log.info("invokeInsertThenRollback 'BBB'");
        insertThenRollback();
    }
}
