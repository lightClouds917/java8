package com.java4all.controller;


/**
 * @author ITyunqing
 * @date 2019年11月02日 22:13:11
 */
public class ATest {
    public static void main(String[]args){
        Runnable r = () -> System.out.println("threadName:"+Thread.currentThread().getName());
        r.run();
        process(()->System.out.println("aaa:"+Thread.currentThread().getName()));
    }

    public static void process(Runnable run){
        run.run();
    }



}

