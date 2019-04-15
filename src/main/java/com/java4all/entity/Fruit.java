package com.java4all.entity;

import java.math.BigDecimal;
import lombok.Data;

/**
 * 水果
 * @author wangzhongxiang
 * @date 2019年04月15日 22:27:20
 */
@Data
public class Fruit {

    private Integer id;

    private String colour;

    private BigDecimal weight;

    private Integer num;

    private String address;

    private String taste;
}
