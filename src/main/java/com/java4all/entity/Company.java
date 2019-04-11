package com.java4all.entity;

import java.util.Date;
import lombok.Data;

/**
 * @author wangzhongxiang
 * @date 2019年04月11日 09:56:34
 */
@Data
public class Company {
    private String id;

    private Integer compCoreId;

    /**
     * 父节点
     */
    private Integer pid;

    /**
     * 层级
     */
    private Boolean level;

    private String compPk;

    private String compCode;

    private String compSignName;

    private String compShortName;

    /**
     * 公司名称
     */
    private String compName;

    /**
     * 联系人
     */
    private String contPerson;

    /**
     * 联系人手机号码
     */
    private String contPhone;

    /**
     * 联系人座机号码
     */
    private String contTel;

    /**
     * 联系人职务
     */
    private String contPosition;

    /**
     * 公司座机号码
     */
    private String compTel;

    /**
     * 公司地址
     */
    private String compAddress;

    /**
     * 公司法人代表
     */
    private String lealPerson;

    /**
     * 注册时间，系统注册
     */
    private Date registerTime;

    /**
     * 公司电子邮件
     */
    private String compEmail;

    /**
     * 注册用户名
     */
    private String registerName;

    /**
     * 登录密码
     */
    private String compPwd;

    /**
     * 公司的行业（类型）
     */
    private String compTrade;

    /**
     * 传真
     */
    private String compFax;

    /**
     * 0:启用  1：禁止
     */
    private String enabled;

    /**
     * 0：未审核 1：审核通过 2：审核未通过
     */
    private String ischeck;

    /**
     * 联系人1
     */
    private String contPerson1;

    /**
     * 联系人1手机号码
     */
    private String contPhone1;

    /**
     * 联系人1座机
     */
    private String contTel1;

    /**
     * 联系人1职务
     */
    private String position1;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 公司类型 0公司 1第三方机构
     */
    private String type;

    private String compno;

    /**
     * 社会信用代码
     */
    private String creditCode;

    /**
     * 0后端  1前端
     */
    private String source;


}
