package com.java4all.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangzhongxiang
 * @date 2019年05月21日 20:06:49
 */
public class Demo1 {

    public static void main(String[]args){
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("5");
        list1.add("6");
        list1.add("7");

        List<String> list2 = new ArrayList<String>();
        list2.add("2");
        list2.add("3");
        list2.add("7");
        list2.add("8");

        //交集
        List<String> collect1 = list1.stream().filter(num -> list2.contains(num))
                .collect(Collectors.toList());
        collect1.stream().forEach(System.out::println);
    }
}
