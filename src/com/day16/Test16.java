package com.day16;

public class Test16 {
    public static void main(String[] args) {
        for (int i=100;i<1000;i++){
            int ge =i%10;
            int shi =i/10%10;
            int bai =i/10/10%10;
//            int geCube=(int)Math.pow(ge,3);
//            int shiCube=(int)Math.pow(shi,3);
//            int baiCube=(int)Math.pow(bai,3);
            if(i==ge*ge*ge+shi*shi*shi+bai*bai*bai){
                System.out.println(i);
            }
        }
    }
}
