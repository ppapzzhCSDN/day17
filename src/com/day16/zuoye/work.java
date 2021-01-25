package com.day16.zuoye;

public class work {
    public static void main(String[] args) {
//        int num =100;
        int sum =getSum(100);
        System.out.println(sum);
    }
    public static int getSum(int num){
        if(num ==2){
            return 2;
        }else
        return num+getSum(num-2);
    }

}

