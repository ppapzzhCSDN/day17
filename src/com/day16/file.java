package com.day16;

import java.io.File;

public class file {
    public static void main(String[] args) {
//        File file =new File("D:\\a\\a.txt");
////        System.out.println(file);
////        file.getAbsoluteFile();
////        System.out.println(file);
//        System.out.println(file.getName());   //文件构造路劲  ==  a.txt
//        System.out.println(file.getAbsoluteFile());   //文件绝对路劲====  D:\a\a.txt
//        System.out.println("文件长度 : "+file.length());     //
//        System.out.println(file.getPath());   //将此File转换为路径名字符串 == D:\a\a.txt
//        File fire2 =new File("2020.txt");

        File file = new File("C");
//        System.out.println(file.length());

        File file2 =new File("D:\\code\\day02\\day15");
//        System.out.println(file2.getName());
//        System.out.println(file2.length());


         File file3 =new File("D:\\a");
        String[] list = file.list();
        for(String kk:list){
//                System.out.println(kk);
            }
        }
        public static void b(int i){
            System.out.println(i);
            if(i<=1000){
                return;
            }
//            b(++);
        }

    }