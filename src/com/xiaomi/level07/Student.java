package com.xiaomi.level07;

public class Student {
    private String classno;
    private String name;
    private double score;

    public Student() {
    }

    public Student(String classno, String name, double score) {
        this.classno = classno;
        this.name = name;
        this.score = score;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;

    }

    public void setScore(double score) {
        this.score = score;
        if(score<0){
//            throw new NoScoreException
        }
    }
}
