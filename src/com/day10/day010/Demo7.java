package com.day10.day010;

public class Demo7 {
    public static void main(String[] args) {
        int[] arr={1,32,43,4453,5,45};
        int sum =getSum(arr);
        System.out.println(sum);
    }

    public static int getSum(int... arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }
    /*
     * 完成数组  所有元素的求和 原始写法

      public static int getSum(int[] arr){
        int sum = 0;
        for(int a : arr){
            sum += a;
        }

        return sum;
      }
    */

}
