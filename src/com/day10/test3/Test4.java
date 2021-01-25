package com.day10.test3;

import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        //添加元素

        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");
        System.out.println(link);
        // 获取元素
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        while (!link.isEmpty()){
            System.out.println(link.pop());  //d打印出栈顶
        }
    }
}
