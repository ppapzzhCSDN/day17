package com.day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws Exception {
//        FileInputStream fis = null;
//        FileOutputStream fos = null;  //随机成成一个时针数？？
        FileInputStream fis = new FileInputStream("d:\\c\\1.jpg");
        FileOutputStream fos = new FileOutputStream("d:\\b\\"+System.currentTimeMillis()+".jpg"); //new Date().getTime()
        byte[] b = new byte[64];
        int len;
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }
        fos.close();
        fis.close();

    }
}