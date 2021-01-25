package com.day08;

import java.util.Objects;

public class Demo9 {
    private String name;
    private int age;

    public Demo9() {
    }

    public Demo9(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo9 demo9 = (Demo9) o;
        return age == demo9.age &&
                Objects.equals(name, demo9.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
