package com.example.springbucksdemo.entity;

import com.sun.xml.internal.ws.spi.db.DatabindingException;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.joda.money.Money;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="T_MENU")
public class Coffee implements Serializable {

    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    /**
     * 做映射,制定CNY人民币
     */
    @Type(type = "org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyAmount",
    parameters = {@org.hibernate.annotations.Parameter(name="currencyCode",value = "CNY")})
    private Money price;

    /**
     * 创建时间戳
     */
    @CreationTimestamp
    private Date createTime;

    /**
     * update时间戳
     */
    @UpdateTimestamp
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Coffee(String name, Money price, Date createTime, Date updateTime) {
        this.name = name;
        this.price = price;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Coffee() {
    }

}
