package com.csii.ljj.io.test.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        // IO里面大量运用这种装饰着模式
        Commponent commponent = new Concreate3(new Concreate2(new Concreate()));
        commponent.doSomething();
    }
}
