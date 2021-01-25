package com.day10.day010;

import java.util.HashSet;

public class Demo4 {
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<String>();
        set.add("张志航");
        set.add("徐向前");
        set.add("范志毅");
        set.add("高峰");
        System.out.println(set);
        for (String name:set){
            System.out.println(name);
        }
    }
}
