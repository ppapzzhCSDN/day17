package com.day8;

public class Person implements Swimming{
    @Override
    public void swim() {
        System.out.println("在狗刨式游泳");
    }
}
