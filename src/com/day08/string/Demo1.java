package com.day08.string;

public class Demo1 {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);    //返回  不是null;
        String str2 = new String("abc");
        System.out.println(str2);
        char[] chs={'A','B','R','Q','N'};       //.String(char[] value) 通过字符数组来创建字符串对象
        String str3 =new String(chs);
        System.out.println(str3 );
        byte[] bytes ={97,98,99,100,101,102};   //String(byte[] bytes) 通过字节数组来构造新的字符串对象
        String str4=new String(bytes);
        System.out.println(str4);
        String str5 =new String(bytes,1,2);//通过字节数组一部分来构造新的字符串对象
        System.out.println(str5);

    }
}
