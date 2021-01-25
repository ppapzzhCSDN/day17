package com.day07.test;

public class Animal implements LiveAble {
//    ublic static void main(String[] args) {
//        Animal a = new Animal();
//        a.fly();
//    }p

    @Override
    public void fly() {
        System.out.println("自由自在的飞~");
    }
    static {

        System.out.println();
    }
}