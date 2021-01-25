package com.day07.test;

public interface LiveAble {
    public default void fly(){
        System.out.println("飞");
    }
}
