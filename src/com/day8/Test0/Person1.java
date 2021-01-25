package com.day8.Test0;

public class Person1 {
    class Person {
        private String name="凤姐";

        public void eat(){
            //筷子
            class Chopsticks{

                private int length;

                public void use(){
                    //使用外部类变量
                    System.out.println(name+"在使用长为"+length+"的筷子吃饭");
                }

                public int getLength() {
                    return length;
                }

                public void setLength(int length) {
                    this.length = length;
                }
            }
            Chopsticks c=new Chopsticks();
            c.setLength(50);
            c.use();
        }

    }
}
