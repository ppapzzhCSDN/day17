package com.day17.work;

public class employee implements java.io.Serializable{
    private String adaress;
    private String name;
    private transient int age;

    public employee() {
    }
}
