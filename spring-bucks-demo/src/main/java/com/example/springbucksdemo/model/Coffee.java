package com.example.springbucksdemo.model;

import lombok.Builder;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.joda.money.Money;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 不使用Lombok了,破坏封装性,如果有的不需要get,set的情况下
 */
@Entity
@Builder
@ToString(callSuper = true)
@Table(name="T_MENU")
public class Coffee extends BaseEntity implements Serializable {

    private String name;
    /**
     * 做映射,指定CNY人民币
     * PersistentMoneyAmount是bigdecimal(19,2)
     * PersistentMoneyMinorAmount是bigint Long
     */
//    @Type(type = "org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyAmount",
    @Type(type = "org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyMinorAmount",
    parameters = {@org.hibernate.annotations.Parameter(name="currencyCode",value = "CNY")})
    private Money price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public Coffee(Long id, Date createTime, Date updateTime, String name, Money price) {
        super(id, createTime, updateTime);
        this.name = name;
        this.price = price;
    }

    public Coffee(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public Coffee() {
    }

}
