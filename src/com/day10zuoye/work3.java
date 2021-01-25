package com.day10zuoye;

import java.util.ArrayList;
import java.util.HashSet;

public class work3 {
    public static void main(String[] args) {
        ArrayList<String> array1 =new ArrayList<>();
        array1.add("a");
        array1.add("b");
        array1.add("a");
        array1.add("c");
        array1.add("d");
        ArrayList<String> array2=new ArrayList<>();
        array2.add("e");
        array2.add("f");
        array2.add("a");
        array2.add("d");
        array2.add("g");
        HashSet<String> list =new HashSet<>();
        for (String string:array1){
            list.add(string);
        }
        System.out.println(list);
        HashSet<String> list2 =new HashSet<>();
        for (String string2:array2){
            list2.add(string2);
        }
        System.out.println(list2);
    }
}
