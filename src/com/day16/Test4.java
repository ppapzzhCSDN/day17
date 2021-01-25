package com.day16;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test4 {
    public static void main(String[] args) throws Exception {
        FileReader fr =new FileReader("D:\\a\\a.txt");
        int b ;
        char[] a = new char[2];
        while ((b=fr.read())!=-1){
//            System.out.println((char)b);
            fr.read(a,0,b);
        }
        fr.close();
    }
}
