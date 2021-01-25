package com.day10.day010;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("l love you");
        System.out.println(list);
        list.add(2,"ppap");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(2,"chenlaidi");   //修改其中的值
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
            for (String kk:list){
                System.out.println(kk);
            }

        }

    }
}
