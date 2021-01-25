package com.day007zuoye.work2;

public class Test {
    public static void main(String[] args) {
        OldPhone oldPhone =new OldPhone();
        oldPhone.call();
        oldPhone.Message();
        NewPhone newPhone =new NewPhone();
        newPhone.call();
        newPhone.Message();
        newPhone.playGame();
    }

}
