package com.csii.ljj.io.test.decorator;

public class Concreate2 extends Decorator {
    public Concreate2(Commponent commponent) {
        super(commponent);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        this.doOtherthing();
    }
    public void doOtherthing(){
        System.out.println("B");
    }
}
