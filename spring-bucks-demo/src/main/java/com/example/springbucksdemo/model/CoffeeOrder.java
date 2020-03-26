package com.example.springbucksdemo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Entity标注用于实体类声明语句之前，指出该Java 类为实体类，将映射到指定的数据库表。
 * 如声明一个实体类 CoffeeOrder，它将映射到数据库中的 @Table指定的名称表上 T_ORDER
 */
@Entity
@Data
@Builder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name="T_ORDER")
public class CoffeeOrder extends BaseEntity implements Serializable {

    private String customer;
    /**
     * 咖啡跟订单的关系 多对多
     */
    @ManyToMany
    @JoinTable(name="T_ORDER_COFFEE")
    private List<Coffee> items;
    //不能为空值
    @Column(nullable = false)
    private OrderState state;

}
