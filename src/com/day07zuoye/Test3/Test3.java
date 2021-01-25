package com.day07zuoye.Test3;

public class Test3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("王小平", 30, "Java");
        teacher.Teach();
        Student student=new Student("李小平",15,90);
        student.exam();

    }
}