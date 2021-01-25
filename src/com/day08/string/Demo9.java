package com.day08.string;

public class Demo9 {
    public static void main(String[] args) {
        int num=10000;
        long start1=System.currentTimeMillis();
        String str ="hello";
        for (int i = 0; i <num ; i++) {
            str=str+i;     //打印num次
        }
        long end1=System.currentTimeMillis();;
        long start2=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <num ; i++) {
            sb.append(i);
        }
        long end2=System.currentTimeMillis();
        long start3=System.currentTimeMillis();
        StringBuffer sb3=new StringBuffer();
        for (int i = 0; i <num ; i++) {
            sb3.append(i);
        }
        long end3=System.currentTimeMillis();
        System.out.println(end1-start1);
        System.out.println(end2-start2);
        System.out.println(end3-start3);
    }
}
