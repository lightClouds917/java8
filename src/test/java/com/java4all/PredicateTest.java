package com.java4all;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ITyunqing
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PredicateTest {

    @Test
    public void test(){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(7);
        list1.add(19);
        list1.add(20);

        Predicate<Integer> predicate =(Integer i)-> i.compareTo(5)<0;
        List<Integer> result = filter(list1, predicate);
        result.stream().forEach(a->System.out.println(a));


    }

    public static <T> List<T> filter(List<T> list,Predicate<T> p){
        List<T> list1 = new ArrayList<>();
        list.forEach(a->{
            if(p.test(a)){
                list1.add(a);
            }
        });
        return list1;
    }




}
