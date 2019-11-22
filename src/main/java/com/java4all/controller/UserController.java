package com.java4all.controller;

import com.java4all.entity.User;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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

    private static final ExecutorService executorService = Executors.newFixedThreadPool(5);
    /**
     * web启动测试
     * @return
     */
    @GetMapping(value = "test")
    public String test(){
        return "Hello,IT云清,It is ok !";
    }


    public static void main(String[]args){
        for(int i = 0 ;i < 1000; i ++){
            Runnable runnable = () -> test1();
            executorService.submit(runnable);
        }

    }

    public static void test1(){
        System.out.println(Thread.currentThread().getName());
        int i = 4/0;
    }
}
