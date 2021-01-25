package com.day08.string;

public class Demo6 {
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder();
//        StringBuilder sb2 =new StringBuilder("hello");
//        System.out.println("builder"+sb);
//        System.out.println("builder"+sb2);
//        System.out.println(sb==sb2);
        StringBuilder builder = new StringBuilder();
        //public StringBuilder append(任意类型)
        StringBuilder builder2 = builder.append("hello");
        //对比一下
        StringBuilder builder3 =builder.append("hello");
        System.out.println(builder3);
        System.out.println("builder:"+builder);
        System.out.println("builder2:"+builder2);
        System.out.println(builder == builder2); //true   同一个对象 不用多new 一个对象

        StringBuffer sb3=new StringBuffer();
        sb3.append("heollo").append("dsd");
        System.out.println(sb3);
    }
}
