package com.day10.day010;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Demo10 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("邓超", "孙俪");
        Set<String> keys = map.keySet();  //取出元素。键找值方式
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key+"=="+value);
//        System.out.println(map);
//        System.out.println(map.get("黄晓明"));
//        System.out.println(map.get("黄明"));


        }
    }
}