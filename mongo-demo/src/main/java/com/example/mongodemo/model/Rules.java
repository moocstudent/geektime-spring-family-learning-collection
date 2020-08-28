package com.example.mongodemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Author: zhangQi
 * @Date: 2020-08-20 10:46
 */
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rules {

    private Long id;

    private String ruleName;

    private String factName;

    private String factField;

    private String factRule;

    private String fieldScore;

    private Date createTime;

    private Date updateTime;

}
