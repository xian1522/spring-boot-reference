package com.wj.springbootreference.lambda;

public class Main {
    public static void main(String[] args) {
        MyListener myListener = new MyListener();
        myListener.takeAction(action -> System.out.println(action),myAction -> myAction.doSomeThing());
    }
}
