package com.java4all.controller;

import com.java4all.entity.User;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhongxiang
 * @date 2019年01月11日 01:19:22
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    /**
     * web启动测试
     * @return
     */
    @GetMapping(value = "test")
    public String test(){
        return "Hello,IT云清,It is ok !";
    }


    public static void main(String[]args){

    }

    public static void test1(){
        List<User> users = User.initUser();

    }
}
