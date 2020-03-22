package com.example.programmatictransactiondemo;

import com.example.programmatictransactiondemo.service.FooService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import java.sql.SQLTransactionRollbackException;

/**
 * 一致的事务模型
 * JDBC/Hibernate/MyBatis
 * DataSource/JTA
 *
 * 事务抽象的核心接口
 * PlatformTransactionManager
 * - DataSourceTransactionManager
 * - HibernateTransactionManager
 * - JtaTransactionManager
 * TransactionDefinition
 * - Propagation
 * - Isolation
 * - Timeout
 * - Read-only status
 *
 * 事务传播特性
 * |-------------------------------------------------------------------------|
 * |传播性                          |  值  |          描述                     |
 * |PROPAGATION_REQUIRED(必须)      |  0  | 当前有事务就用当前的,没有就用新的(默认) |
 * |PROPAGATION_SUPPORTS(支持)      |  1  | 事务可有可无,不是必须的               |
 * |PROPAGATION_MANDATORY(强制)     |  2  | 当前一定要有事务,不然就抛异常          |
 * |PROPAGATION_REQUIRES_NEW(新)    |  3  | 无论是否有事务,都起个新的事务          |
 * |PROPAGATION_NOT_SUPPORTED(不支持)|  4  | 不支持事务,按非事务方式运行           |
 * |PROPAGATION_NEVER(从不支持)       |  5  |  不支持事务,如果有事务则抛异常        |
 * |PROPAGATION_NESTED(嵌套事务)      |  6  | 当前有事务就在当前事务里再起一个事务    |
 * |--------------------------------------------------------------------------|
 *
 * 事务隔离特性
 * |-----------------------------------------------------|
 * | 隔离性                    |值 |脏读 |不可重复读|  幻读  |
 * |ISOLATION_READ_UNCOMMITTED| 1 | √  |   √    |   √    |
 * |ISOLATION_READ_COMMITTED  | 2 | X  |   √    |   √    |
 * |ISOLATION_REPEATABLE      | 3 | X  |   X    |   √    |
 * |ISOLATION_SERIALIZABLE    | 4 | X  |   X    |   X    |
 * |-----------------------------------------------------|
 *
 * 编程式事务
 * TransactionTemplate
 * - TransactionCallback
 * - TransactionCallbackWithoutResult
 * PlatformTransactionManager
 * - 可以传入TransactionDefinition进行定义
 *
 * 基于注解的配置方式
 * 开启事务注解的方式
 * -@EnableTransactionManagerment
 * -<tx:annotation-driven/>
 * 一些配置
 * -proxyTargetClass
 * -mode
 * -order
 * -@Transactional
 * -transactionManager
 * -propagation
 * -isolation
 * -timeout
 * -readOnly
 * -怎么判断回滚
 *
 */
@SpringBootApplication(proxyBeanMethods=false)
@Slf4j
public class ProgrammaticTransactionDemoApplication implements CommandLineRunner {
    @Autowired
    private TransactionTemplate transactionTemplate;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private FooService fooService;

    public static void main(String[] args) {
        SpringApplication.run(ProgrammaticTransactionDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("COUNT BEFORE TRANSACTION : {}",getCount());
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                //执行插入数据
                jdbcTemplate.execute("INSERT INTO FOO(ID,BAR) VALUES (1,'aaa')");
                log.info("COUNT IN TRANSACTION: {}",getCount());
                //事务回滚
                transactionStatus.setRollbackOnly();
            }
        });
        log.info("COUNT AFTER TRANSACTION: {}",getCount());
    }

    //count下,返回来FOO表中的数据条目
    private long getCount(){
        return (long) jdbcTemplate.queryForList("SELECT COUNT(*) AS CNT FROM FOO")
                .get(0).get("CNT");
    }

}
