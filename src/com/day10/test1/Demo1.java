package com.day10.test1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        List<String> list = new ArrayList<>();
        for (int i = 0; i <100000; i++) {

            list.add("张三");

        }
        list.add("李四");
        list.add("王五");
        list.add("赵四");
        list.add("刘五");
        list.add("周六");
        list.add("曾七");
        list.add("朱八");
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        List<String> list2 = new LinkedList<>();
        for (int i = 0; i <100000 ; i++) {

            list2.add("张三");
        }
        list2.add("李四");
        list2.add("王五");
        list2.add("赵四");
        list2.add("刘五");
        list2.add("周六");
        list2.add("曾七");
        list2.add("朱八");
        long end2 = System.currentTimeMillis();

        System.out.println(end1-start1);
        System.out.println("=========");
        System.out.println(end2-start2);
    }
}
