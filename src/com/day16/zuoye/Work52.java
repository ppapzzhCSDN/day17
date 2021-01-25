package com.day16.zuoye;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Work52 {
    public static void main(String[] args) throws Exception{
        long start =System.currentTimeMillis();
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("D:\\c3p0-0.9.5.2.jar"));
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("D:\\a\\c3p0-0.9.5.2.jar"));
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        bos.close();
        bis.close();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
