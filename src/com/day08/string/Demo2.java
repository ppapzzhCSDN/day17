package com.day08.string;

public class Demo2 {
    public static void main(String[] args) {
        String s1="dfbz";
        String s2="dfbz";
        String s3="DFBZ";

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println("============");

        System.out.println(s1.equalsIgnoreCase(s2));  //将此字符串与指定对象进行比较，忽略大小xie

        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
