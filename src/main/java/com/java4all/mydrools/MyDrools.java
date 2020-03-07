package com.java4all.mydrools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.kie.api.KieServices;
import org.kie.api.KieServices.Factory;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * https://www.cnblogs.com/ityouknow/archive/2017/08/07/7297524.html
 * @author wangzhongxiang
 * @date 2020年03月06日 14:39:51
 */
public class MyDrools {

    public static void main(String[]args){
        List<Customer> list = new ArrayList();
        KieServices ks = Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        execute(kc,list);
        list.forEach(customer -> System.out.println("处理后："+customer));
    }


    public static void execute(KieContainer kc,List list){
        KieSession kieSession = kc.newKieSession("point-rulesKS");
        kieSession.setGlobal("newCustomer",list);
        List<Customer> customers = initData();
        customers.stream().forEach(customer -> {
            System.out.println(customer);
            kieSession.insert(customer);
            kieSession.fireAllRules();
        });
        kieSession.dispose();

    }


    public static List<Customer> initData(){
        Customer customer1 = new Customer(10, 150, 0,"rich");
        Customer customer2 = new Customer(50, 110, 0,"rich");
        Customer customer3 = new Customer(50, 300, 0,"rich");
        Customer customer4 = new Customer(20, 300, 0,"rich");
        List<Customer> customers = Arrays.asList(customer1, customer2, customer3,customer4);
        return customers;

    }
}
