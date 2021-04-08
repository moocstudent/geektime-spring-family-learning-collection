package com.example.webfluxmongodbdemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Author: zhangQi
 * @Date: 2020-08-21 9:38
 */
@Document
public class Rule {

    @Id
    private Long id;

    private String ruleName;

    private String factName;

    private String factField;

    private String factRule;

    private String fieldScore;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getFactName() {
        return factName;
    }

    public void setFactName(String factName) {
        this.factName = factName;
    }

    public String getFactField() {
        return factField;
    }

    public void setFactField(String factField) {
        this.factField = factField;
    }

    public String getFactRule() {
        return factRule;
    }

    public void setFactRule(String factRule) {
        this.factRule = factRule;
    }

    public String getFieldScore() {
        return fieldScore;
    }

    public void setFieldScore(String fieldScore) {
        this.fieldScore = fieldScore;
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
}
