package com.java4all;


import com.java4all.entity.Company;
import com.java4all.entity.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.jws.soap.SOAPBinding.Use;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ITyunqing
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FunctionTest {

    @Test
    public void test(){
        List<Integer> map = map(Arrays.asList("aaa", "vvvvvv", "c"), (String s) -> s.length());
        System.out.println(map.toString());
    }

    public static <T,R> List<R> map(List<T> list,Function<T,R> function){
        List<R> result = new ArrayList<R>();
        for(T t: list){
            result.add(function.apply(t));
        }
        return result;
    }


    @Test
    public void teset(){

System.out.println(this.aa());

    }

    public boolean aa(){
        B b = new B();
        b = null;
        return b == null || !(b instanceof A);
    }


class A{}
class B extends A{}
}
