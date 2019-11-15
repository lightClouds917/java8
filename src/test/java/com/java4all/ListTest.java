package com.java4all;

import java.util.ArrayList;
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
 * @author ITyunqing
 * @date 2019年11月15日 17:37:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ListTest {


    /**You can specify a key to groupby*/
    private final String SKIP_KEY = "name";

    @Test
    public void test(){
        List<Map<String, Object>> list = this.initData();
        Map<String, List<Map<String, Object>>> mlm =
                list.stream().collect((Collectors.groupingBy(map -> map.get(SKIP_KEY).toString())));
        List<Map<String,Object>> listRe = new ArrayList<>();
        mlm.forEach((s, maps) -> {
            Map<String, Object> re = new HashMap<>(4);
            re.put(SKIP_KEY,s.toString());
            Set<String> keys = maps.get(0).keySet();
            keys.remove(SKIP_KEY);
            keys.stream().forEach(key->re.put(key,maps.stream().mapToInt(map->Integer.valueOf(map.get(key).toString())).sum()));
            listRe.add(re);
        });
        System.out.println("以下为结果");
        listRe.stream().forEach(map -> System.out.println(map.toString()));
    }

    public List<Map<String,Object>> initData(){
        Map<String,Object> map1 = new HashMap<>(4);
        Map<String,Object> map2 = new HashMap<>(4);
        Map<String,Object> map3 = new HashMap<>(4);
        Map<String,Object> map4 = new HashMap<>(4);
        map1.put("name","张三");
        map1.put("money",200);
        map1.put("amount",30);

        map2.put("name","张三");
        map2.put("money",500);
        map2.put("amount",30);

        map3.put("name","李四");
        map3.put("money",600);
        map3.put("amount",20);

        map4.put("name","李四");
        map4.put("money",500);
        map4.put("amount",20);

        List<Map<String, Object>> maps = Arrays.asList(map1, map2,map3,map4);
        System.out.println(maps.toString());
        System.out.println("以上为原始数据");
        return maps;
    }

    @Test
    public void test2(){
        String [] array = {"hello","love","me"};

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = integers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(collect.toString());

        List<Integer> integers1 = Arrays.asList(1, 2, 3);
        List<Integer> integers2 = Arrays.asList(4,5);

//        List<Stream<int[]>> collect1 = integers1.stream()
//                .map(i -> integers2.stream().map(j -> new int[]{i, j}))
//                .collect(Collectors.toList());
//
//        collect1.stream().forEach(s->System.out.println(Arrays.toString(s.toArray())));
        
        System.out.println("-------------");

        List<int[]> collect2 = integers1.stream()
                .flatMap(i -> integers2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        collect2.stream().forEach(ss->System.out.println(Arrays.toString(ss)));



    }
}
