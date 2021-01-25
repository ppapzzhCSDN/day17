package com.day08;

public class Demo3 {
    public static void main(String[] args) {
        Integer i = new Integer(4);//使用构造函数 函数
        Integer i11= 4;  //这种方式和上面一样


        i=i +5;  //等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5;
                //加法运算完成后，再次装箱，把基本数值转成对象。

        Integer i2 = Integer.valueOf(4); //使用包装类中的valueof()方法
        int num = i.intValue();   //拆箱  从包装类--》基本类型
        System.out.println(i);
        System.out.println(i2);
        System.out.println(num);    //4
        //- 装箱：从基本类型转换为对应的包装类对象。
        //- 拆箱：从包装类对象转换为对应的基本类型。

    }
}
