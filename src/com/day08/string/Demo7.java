package com.day08.string;

public class Demo7 {
    public static void main(String[] args) {    //关于toString的方法  =====Stringbuilder会转化成S不可以改变的tring对象
        StringBuilder sb = new StringBuilder().append("hello").append("world").append("aini ");
        //调用方法
        String str = sb.toString();
        System.out.println(str);  //这样就转变成不可以改变的字符串


    }
}
