package com.java4all;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ITyunqing
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerTest {

    @Test
    public void test(){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(7);
        list1.add(19);
        list1.add(20);

        foreach(list1,(Integer i)->System.out.println(i));

    }

    public static <T> void foreach(List<T> list,Consumer<T> consumer){
        list.stream().forEach(obj->consumer.accept(obj));
    }

}
