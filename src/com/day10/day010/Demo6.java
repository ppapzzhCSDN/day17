package com.day10.day010;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo6 {
    public static void main(String[] args) {
        Set<String> set =new LinkedHashSet<String>();
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");
        set.add("abc");
        set.add("cba");
        System.out.println(set);
//        Iterator<String> it =set.iterator();   //使用迭代器
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
