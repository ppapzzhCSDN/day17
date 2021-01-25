package com.day17.work2;

import org.junit.*;

public class Demo {
//    public static void main(String[] args) {
//        System.out.println("主方法");
//    }

    @Test
    public void a() {
        System.out.println("a方法");   //必须是无返回值 且不带参
    }

    @Test
    public void b() {
        System.out.println("b方法");
    }

    @Before
    public void c() {
        System.out.println("方法前");
    }

    @After
    public void d() {
        System.out.println("方法后");
    }

    @BeforeClass
    public static void e() {
        System.out.println("静态代码块 -方法前的前面");   //有且只执行一次
    }

    @AfterClass
    public static void f() {
        System.out.println("静态代码块- 方法后面的后面");
    }
    @Test
    public void g(){
        System.out.println("有返回值");

    }


}
