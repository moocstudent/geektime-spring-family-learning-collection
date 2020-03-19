package com.example.programmatictransactiondemo;

import com.example.programmatictransactiondemo.service.FooService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLTransactionRollbackException;

@SpringBootTest
@Slf4j
class ProgrammaticTransactionDemoApplicationTests {
    @Autowired
    private FooService fooService;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void testTransaction() {
        fooService.insertRecord();
        log.info("AAA {}",
                jdbcTemplate.queryForObject(
                        "SELECT COUNT(*) FROM FOO WHERE BAR='AAA'",Long.class
                ));
        try {
            fooService.insertThenRollback();
        } catch (SQLTransactionRollbackException e) {
            log.info("BBB {}",
                    jdbcTemplate.queryForObject(
                            "SELECT COUNT(*) FROM FOO WHERE BAR='BBB'",Long.class
                    ));
        }

        try {
            fooService.invokeInsertThenRollback();
        } catch (SQLTransactionRollbackException e) {
            log.info("BBB {}",
                    jdbcTemplate.queryForObject(
                            "SELECT COUNT(*) FROM FOO WHERE BAR='BBB'",Long.class
                    ));
        }
    }

}
