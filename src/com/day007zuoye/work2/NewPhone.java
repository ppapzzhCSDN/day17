package com.day007zuoye.work2;

public class NewPhone implements Play{
    public void call(){
        System.out.println("新手机打电话");
    }
    public  void Message(){
        System.out.println("新手机发短信");
    }
    @Override
    public void playGame() {
        System.out.println("新手机展示新功能 玩游戏");
    }

}
