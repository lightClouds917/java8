package com.java4all;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangzhongxiang
 * @date 2019年11月15日 17:37:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ListTest {

    
    @Test
    public void test(){
        Map<String,Object> map1 = new HashMap<>(4);
        Map<String,Object> map2 = new HashMap<>(4);
        map1.put("name","张三");
        map1.put("money",200);
        map1.put("amount",30);
        map2.put("name","张三");
        map2.put("money",500);
        map2.put("amount",30);

        List<Map<String, Object>> maps = Arrays.asList(map1, map2);
        System.out.println(maps.toString());


        Map<String,Integer> result = new HashMap<>();
        Set<String> keys = maps.get(0).keySet();
        boolean name = keys.remove("name");
        keys.stream().forEach(key-> result.put(key,maps.stream().mapToInt(map -> Integer.valueOf(map.get(key.toString()).toString())).sum()));
        System.out.println(result.toString());

//        Map<Object, List<Map<String, Object>>> mapp = maps.stream()
//                .collect(Collectors.groupingBy(map -> map.get("name")));
//        System.out.println(mapp.toString());

    }
}
