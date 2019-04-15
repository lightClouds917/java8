package com.java4all.entity;

import java.util.Date;
import lombok.Data;

/**
 * 用户
 * @author wangzhongxiang
 * @date 2019年04月11日 09:56:34
 */
@Data
public class User {

    private Integer id;

    /**
     * 部门
     */
    private String department;

    /**
     * 手机
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 企业id
     */
    private String comanyId;

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
