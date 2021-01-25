package com.day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("D:\\b\\a.txt");
        int b;
        while ((b =fis.read())!=-1) {
            System.out.println((char)b);
        }
        fis.close();

    }
}
