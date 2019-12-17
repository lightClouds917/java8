package com.java4all;

import com.java4all.service.UserServiceImpl;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ITyunqing
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GetInterfacesTest {

    @Test
    public void test(){
        UserServiceImpl userService = new UserServiceImpl();
        Class<?>[] allInterfaces = this.getAllInterfaces(userService);
        Arrays.stream(allInterfaces).forEach(aClass -> System.out.println(aClass));
    }

    public Class<?>[] getAllInterfaces(Object bean){
        Set<Class<?>> classes = new HashSet<>();
        if(bean != null){
            Class<?> clazz = bean.getClass();
            while (!Object.class.getName().equalsIgnoreCase(clazz.getName())){
                Class<?>[] interfaces = clazz.getInterfaces();
                classes.addAll(Arrays.asList(interfaces));
                clazz = clazz.getSuperclass();
            }
        }
        return classes.toArray(new Class[0]);
    }

}
