package com.day16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\b\\a.txt",true);
//        fos.write('a');
//        fos.write(98);
//        fos.write(99);
//        fos.write("\r\n".getBytes());
//        fos.write("loveyou".getBytes());
//        byte[] b = "abloveyou".getBytes();
//        fos.write(b,2,2);
       byte[] words={97,98,99,100,101,102,103,104};       //整型、字符会自动转 而字符串要强转为字节 getBytes()
        byte[] b = "abcdefghijk".getBytes();
        // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b);
        for (int i = 0; i <words.length ; i++) {
            fos.write(words[i]);
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
