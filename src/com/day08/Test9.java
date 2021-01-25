package com.day08;

public class Test9 {
    public static void main(String[] args) {
        String str ="123";
        String str2 ="123";

        Demo9 d = new Demo9("伟键哥哥",18);
        Demo9 d2 =new Demo9("伟键哥哥",18);
//        System.out.println(str);
//        System.out.println(str2);
//        System.out.println(d);
//        System.out.println(d2);
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(d==d2);
        System.out.println(d.equals(d2));




    }
}
