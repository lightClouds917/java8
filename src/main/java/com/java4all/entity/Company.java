package com.java4all.entity;

import java.util.Date;
import lombok.Data;

/**
 * 公司
 * @author wangzhongxiang
 * @date 2019年04月11日 09:56:34
 */
@Data
public class Company {

    /**
     * id
     */
    private String id;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 法人姓名
     */
    private String legalPersonName;

    /**
     * 法人手机号码
     */
    private String phone;

    /**
     * 公司地址
     */
    private String address;

    /**
     * 1.食品行业 2.农业 3.互联网 4.出版行业
     */
    private Integer type;

    /**
     * 水果id 每周福利
     */
    private Integer fruitId;

    /**
     * 是否996 true
     * 是996，false 不是996
     */
    private boolean whether996;

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
