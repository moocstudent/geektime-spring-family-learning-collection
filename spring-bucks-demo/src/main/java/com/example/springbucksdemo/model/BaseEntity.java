package com.example.springbucksdemo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import	java.io.Serializable;
import java.util.Date;

/**
 * 被继承的共有属性字段
 */
@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键、@GeneratedValue提供了主键的生成策略。
    // @GeneratedValue注解有两个属性,分别是strategy和generator
    //AUTO主键由程序控制,是默认选项 ,不设置就是这个
    //IDENTITY 主键由数据库生成, 采用数据库自增长, Oracle不支持这种方式
    //SEQUENCE 通过数据库的序列产生主键, MYSQL  不支持
    //Table 提供特定的数据库产生主键, 该方式更有利于数据库的移植
    //generator
    //generator属性的值是一个字符串,默认为"",其声明了主键生成器的名称
    //(对应于同名的主键生成器@SequenceGenerator和@TableGenerator)
    private Long id;
    @Column(updatable = false)
    @CreationTimestamp
    private Date createTime;
    @UpdateTimestamp
    private Date updateTime;
}
