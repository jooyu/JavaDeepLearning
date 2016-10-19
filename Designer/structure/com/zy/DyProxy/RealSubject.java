package com.zy.DyProxy;

public class RealSubject implements Subject{

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse: " + arg);
    }
}