package com.day8.Test0;

public class Test {
    public static void main(String[] args) {
        Body.Heart h =new Body().new Heart();  // //创建内部类，第一种方式：
                h.jump();
                Body b =new Body();  ////第二种方式：
                                    //先创建外部类
                Body.Heart h2 = b.new Heart();
                b.live=false;
                h2.jump();

//                Body.Heart h2= new Body().new Heart();
//                h2.jump();
//                Bod;y.Heart h3 = b.new Heart();
//                b.work()

    }
}
