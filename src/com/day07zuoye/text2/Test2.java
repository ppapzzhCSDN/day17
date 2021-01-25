package com.day07zuoye.text2;

public class Test2 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="旺财";
        dog.eat();
        Dog.lookHome();
        System.out.println("--------------");
        Cat cat=new Cat();
        cat.name="波斯猫";
        cat.eat();
        Cat.catchMouse();
    }
}
