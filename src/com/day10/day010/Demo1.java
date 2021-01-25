package com.day10.day010;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {


        Collection<String> coll = new ArrayList<String>();
        coll.add("小李广");
        coll.add("莫早天");
        coll.add("艾娇虎");
        coll.add("良里白条");
        System.out.println(coll);
        System.out.println(coll.contains("小李广"));
        coll.remove("良里白条");
        System.out.println(coll);

        System.out.println( coll.size());//size() 集合中有几个元素
        // Object[] toArray()转换成一个Object数组
        Object[] objects=coll.toArray();
        for (int i = 0; i <coll.size() ; i++) {
            System.out.println(objects[i]);
            coll.clear();
            System.out.println(coll);
            System.out.println(coll.isEmpty());

        }
    }
}