package com.day08.string;

public class Demo8 {
    public static void main(String[] args) {
        long a =System.currentTimeMillis();
        String str = "hello";
        for (int i = 0; i < 100; i++) {
            str = str + i;
        }
        System.out.println(str);
    }

}
