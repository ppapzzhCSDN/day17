package com.day9;

public class Demo6 {
    public static void main(String[] args) {
        String str="abcde";

        //public char[] toCharArray () ：将此字符串转换为新的字符数组。
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]+",");
        }
        System.out.println("\n-------------");
        byte[] bytes = str.getBytes();
        for(int i=0;i<bytes.length;i++){
            System.out.print(bytes[i]+",");
        }
        System.out.println("\n-------------");

    }
}
