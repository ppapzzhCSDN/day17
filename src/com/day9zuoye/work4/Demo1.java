package com.day9zuoye.work4;

public class Demo1 {
    public static void main(String[] args) {
        String str1 ="hello";
        String str2 = new String("hello");
        String str3 ="Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));

//        String a =str1.indexOf("He");
//        System.out.println(a);

    }
}
