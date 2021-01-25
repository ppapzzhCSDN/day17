package com.day10;

import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("刘六");
        set.add("猪八");
        for (String name:set) {
            System.out.println(set);

        }
    }
}
