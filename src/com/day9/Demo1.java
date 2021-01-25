package com.day9;

public class Demo1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello").append("world").append("loveyoou");
        String str =sb.toString();
        System.out.println(str);//StringBuilder对象将会转换为不可变的String对象
    }
}
