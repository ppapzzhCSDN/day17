package com.day06zuoye;

import java.util.Random;

public class Pcperson extends Player {
    public Pcperson() {
    }
    public Pcperson(String name, int score) {
        super(name, score);   //构造方法一定要。
    }
    public int boxing() {
        Random r = new Random();
        int n = r.nextInt(3) + 1;// 返回一个数的基础上再加1
        return n;
    }

}
