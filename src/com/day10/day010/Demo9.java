package com.day10.day010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo9 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        list.add("cba");
        list.add("aba");
        list.add("sha");
        list.add("nba");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0)-o1.charAt(0);  //年龄的话前面加个int return
            }
        });
        System.out.println(list);
    }
}
