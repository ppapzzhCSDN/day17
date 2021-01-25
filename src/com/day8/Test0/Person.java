package com.day8.Test0;

 class Person {
    private String name="凤姐";
    public void eat(){
        class Chopsticks{

            private int lenght;

            public void use(){
                System.out.println(name+"在使用长度为"+lenght+"的筷子吃饭");
            }

            public int getLenght() {
                return lenght;
            }

            public void setLenght(int lenght) {
                this.lenght = lenght;
            }
            Chopsticks c =new Chopsticks();

        }
    }

}
