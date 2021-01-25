package com.day9zuoye.work3;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        Random random = new Random();
        long a = random.nextInt(900000)+100000;
        System.out.println(a);
    }
}
