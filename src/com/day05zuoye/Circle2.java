package com.day05zuoye;

public class Circle2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getPi());
        System.out.println(circle.getR());
//        int result=circle.showArea(2.2f,3.14);
//        System.out.println(result);
        System.out.println(circle.showArea(2.2f,3.14));
        System.out.println(circle.showPerimeter(2.2f,3.14));
    }
}