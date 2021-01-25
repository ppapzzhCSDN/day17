package com.day10.day010;

import java.util.LinkedList;

public class Demo3 {
    public static void main(String[] args) {
        LinkedList<String> link =new LinkedList<String>();
        link.add("宋江");
        link.add("李逵");
        link.add("李鬼");
        link.add("吴用");
        link.add("小李广");
//        System.out.println(link);
//        System.out.println(link.getFirst());
//        System.out.println(link.getLast());
        System.out.println(link);
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());
        while (!link.isEmpty()){
            System.out.println(link.pop());
        }
        System.out.println(link);
    }
}
