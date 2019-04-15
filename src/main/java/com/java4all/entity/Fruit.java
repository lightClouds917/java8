package com.java4all.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 水果
 * @author wangzhongxiang
 * @date 2019年04月15日 22:27:20
 */
@Data
public class Fruit {

    private Integer id;

    /**
     * 颜色
     */
    private String colour;

    /**
     * 重量
     */
    private BigDecimal weight;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 产地
     */
    private String address;

    /**
     * 味道
     */
    private String taste;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * true 已被删除，无效数据
     * false 未被删除，有效数据
     */
    private boolean deleted;

}
