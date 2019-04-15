package com.java4all.entity;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 用户
 * @author wangzhongxiang
 * @date 2019年04月11日 09:56:34
 */
@Data
@ToString
@AllArgsConstructor
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

    /**
     * init
     * @return
     */
    public static List<User> initUser(){
        List<User> users = Arrays.asList(
                new User(1, "人事", "17629555654", "山西", "1", new Date(), new Date(),false),
                new User(2, "人事", "17629551554", "山西", "2", new Date(), new Date(),false),
                new User(3, "人事", "17629231554", "陕西", "4", new Date(), new Date(),false),
                new User(4, "人事", "17629551334", "陕西", "1", new Date(), new Date(),false),
                new User(5, "法务", "17651551554", "陕西", "4", new Date(), new Date(),false),
                new User(6, "法务", "17629551554", "山西", "1", new Date(), new Date(),false),
                new User(7, "法务", "17515551554", "浙江", "4", new Date(), new Date(),false),
                new User(8, "法务", "17629551134", "浙江", "1", new Date(), new Date(),false),
                new User(9, "法务", "17636551554", "浙江", "4", new Date(), new Date(),false),
                new User(10, "公关", "17625151554", "浙江", "1", new Date(), new Date(),false),
                new User(11, "公关", "17625636554", "浙江", "1", new Date(), new Date(),false),
                new User(12, "公关", "17625151554", "山西", "2", new Date(), new Date(),false),
                new User(13, "公关", "17625636554", "甘肃", "4", new Date(), new Date(),false),
                new User(14, "行政", "17625151554", "山西", "4", new Date(), new Date(),false),
                new User(15, "行政", "17625156365", "山西", "4", new Date(), new Date(),false)
        );
        return users;
    }
}
