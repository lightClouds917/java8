package com.java4all.controller;

import org.springframework.stereotype.Component;

/**
 * @author wangzhongxiang
 * @date 2019年11月27日 20:20:10
 */
@Component
public class Banana {

    public Banana() {
        System.out.println("banana construct");
    }

    public void ba(){
        System.out.println("banana");
    }
}
