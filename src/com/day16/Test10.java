package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test10 {
    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\a\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\b\\c.txt");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
            long end = System.currentTimeMillis();
            System.out.println("普通流复制时间:"+(end - start)+" 毫秒");
        }
    }
}
