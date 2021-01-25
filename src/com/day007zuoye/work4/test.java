package com.day007zuoye.work4;

public class test {

    public static void goTosport( Sport sport){   //在测试类中定义静态的goToSport方法,参数为Sport接口类型
        sport.playBasketball();

    }
    public static void main(String[] args) {
        Teacher t1 = new Teacher("马云", 45);
        SportTeacher t2 = new SportTeacher("大姚", 35);//因为SportTeacher 调用了Sport接口
        Student s1 = new Student("小王", 20);             //而Student只是调用了方法
        SportStudent s2 = new SportStudent("王中王", 21);
        t2.playBasketball();
        s2.playBasketball();

        goTosport(t2);
        goTosport(s2);


    }


}

