package com.day9;

public class Demo4 {
    public static void main(String[] args) {


        String str = "HelloWorld";


        //public int length () ：返回此字符串的长度。
        System.out.println(str.length());
        System.out.println("---------------");

        //public String concat (String str) ：将指定的字符串连接到该字符串的末尾。
        String str2 = str.concat("_Java");
        System.out.println(str2);
        System.out.println("---------------");
        char c1 = str2.charAt(0);
        char c2 = str2.charAt(1);
        System.out.println(c1);
        System.out.println(c2);
        String sub2 = str.substring(2, 4);
        System.out.println(sub2);
        System.out.println("---------------");

    }
}