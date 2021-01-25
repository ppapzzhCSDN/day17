package com.day05zuoye;

public class Circle {
    private float r = 2.2f;
    private double pi = 3.14;

    public float getR() {
        return r;
    }

    public double getPi() {
        return pi;
    }

    public double showArea(float r, double pi) {
        return pi * r * 2;
    }

    public double showPerimeter(float r, double pi) {
        return (r + pi) * 2;
    }
}

