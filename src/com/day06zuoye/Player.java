package com.day06zuoye;

public class Player {
    private String name;
    private int score;
    void Boxing() {
        System.out.println("猜拳游戏开始了----");
    }
    public Player() {
    }
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}