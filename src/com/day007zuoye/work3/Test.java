package com.day007zuoye.work3;

public class Test {
    public static void main(String[] args) {
        Animal d =new Dog();
        Animal c =new Cat();
        d.eat();
        c.eat();
        ((Dog) d).lookHome();
        ((Cat) c).zhua();
        if(d instanceof Dog){
            Dog dog =(Dog) d;  //重新定义
            dog.lookHome();
        }else if(c instanceof Cat){
            Cat c2 =(Cat) d;
            c2.zhua();
        }
    }
}
