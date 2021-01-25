package com.day9;

public class Demo3 {
    public static void main(String[] args) {
        char[] chs={'A','B','B','N'};
        String string=new String(chs);
        System.out.println(string);
        byte[] bytes={97,98,99,100,101}; //abcde
        String str4 = new String(bytes);
        System.out.println(str4);
        System.out.println(bytes);
        String str5 = new String(bytes, 1, 2);
        System.out.println(str5);   //dString(byte[] bytes, int offset, int length)
                                    // 通过字节数组一部分来构造新的字符串对象
    }
}
