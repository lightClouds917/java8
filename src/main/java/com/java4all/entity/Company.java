package com.java4all.entity;

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
     * 联系人手机号码
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

}
