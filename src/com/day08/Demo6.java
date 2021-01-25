package com.day08;

public class Demo6 {
    public static void main(String[] args) {
        double min =-10.8;
        double max = 5.9;
        int count=0;
        for (double i = Math.ceil(min); i <Math.ceil(max) ; i++) {
                if(Math.ceil(min)>6 || Math.ceil(max)<2.1){
                    count++;
            }
        }
        System.out.println("绝对值大于 6 或者小于 2.1 的整数有"+count+"个");
    }
}
