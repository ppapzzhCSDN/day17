package com.day16.zuoye;

import java.io.FileInputStream;

public class Test1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis =new FileInputStream("D:\\b\\b.txt");
        byte[] b = new byte[2];
        int len;
        while ((len=fis.read(b))!=-1){
            System.out.println((new String(b)));
        }
        fis.close();

    }

}
