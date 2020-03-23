package com.example.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 对象与关系的范式不匹配
 * |------------------------------------------------------------
 * |                  |        Object       |      RDBMS       |
 * |      粒度         |       类            |       表          |
 * |      继承         |       有            |       没有        |
 * |      唯一性       |  a==b, a.equals(b)  |       主键        |
 * |      关联         |        引用          |       外键       |
 * |     数据访问       |     逐级访问         |   SQL数量要少      |
 * |------------------------------------------------------------|
 *
 * Hibernate
 * -一款开源的对象关系映射(Object/Relational Mapping)框架
 * -将开发者从95%常见数据持久化工作中解放出来
 * -屏蔽了底层数据库的各种细节
 *
 * Java Persistence API
 * JPA为对象关系映射提供了一种基于POJO的持久化模型
 * -简化数据持久化代码的开发工作
 * -为Java社区屏蔽不同持久化API的差异
 * 2006年,JPA1.0作为JSR220的一部分正式发布
 *
 * Spring Data
 * 在保留底层存储特性的同时,提供相对一致的,基于Spring的编程模型
 * 主要模块:
 * Spring Data Commons
 * Spring Data JDBC
 * Spring Data JPA
 * Spring Data Redis
 *
 * 常用JPA注解
 * 实体
 * @Entity,@MappedSuperclass
 * @Table(name)
 * 主键
 * @Id
 * - @GeneratedValue(strategy,generator)
 * - @SequenceGenerator(name,sequenceName)
 *
 * 映射
 * @Column(name,nullable,length,insertable,updatable)
 * @JoinTable(name),@JoinColumn(name)
 * 关系
 * @OneToOne, @OneToMany, @ManyToOne, @ManyToMany
 * @OrderBy
 *
 *
 *
 *
 */
@SpringBootApplication
public class JpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

}
