package com.example.observerdemo.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 16:58
 */
@Entity
@Data
@Builder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name="T_COFFEE")
public class Coffee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
