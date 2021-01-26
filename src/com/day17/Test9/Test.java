package com.day17.Test9;

public class Test {
    public static void main(String[] args) {
        Package p = new Package();
        Thread thread01 = new Thread(p, "实体店");
        Thread thread02 = new Thread(p, "官网");
        thread01.start();
        thread02.start();
    }
}
