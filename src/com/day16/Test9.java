package com.day16;

import java.io.FileWriter;
import java.io.IOException;

public class Test9 {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            fw =new FileWriter("D:\\d\\a.txt");
            fw.write("我是李小龙");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fw !=null){
                    fw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
