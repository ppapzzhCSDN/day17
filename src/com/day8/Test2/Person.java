package com.day8.Test2;

import com.day8.Swimming;

public class Person implements Swim {
    @Override
    public void swimming() {
        System.out.println("在自由自在的游泳");
    }

    @Override
    public void eat() {

    }
}
