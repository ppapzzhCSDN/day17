package com.day10.day010;

import com.day007zuoye.work1.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(21);
        list.add(21);
        list.add(321);
        list.add(33);
        Collections.addAll(list,21,323,43,4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
