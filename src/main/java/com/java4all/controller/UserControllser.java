package com.java4all.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhongxiang
 * @date 2019年04月11日 09:19:22
 */
@RestController
@RequestMapping(value = "user")
public class UserControllser {

    /**
     * web启动测试
     * @return
     */
    @GetMapping(value = "test1")
    public String test1(){
        return "Hello,IT云清,It is ok !";
    }
}
