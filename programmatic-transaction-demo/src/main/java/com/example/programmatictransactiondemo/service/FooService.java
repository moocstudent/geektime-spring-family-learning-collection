package com.example.programmatictransactiondemo.service;

import org.springframework.transaction.interceptor.RollbackRuleAttribute;

import java.sql.SQLTransactionRollbackException;

public interface FooService {

    void insertRecord();

    void insertThenRollback()throws SQLTransactionRollbackException;

    void invokeInsertThenRollback()throws SQLTransactionRollbackException;

}
