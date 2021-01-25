package com.day8.Test0;

public class Body {
    public boolean live=true;
    public void work(){
        System.out.println("在散步");
    }
    class Heart{   //成员内部类  类内方法外
        public void jump(){
            if(live){
                System.out.println("心为你而跳");
            }else {
                System.out.println("不跳了 死了");
            }
        }
    }
}
