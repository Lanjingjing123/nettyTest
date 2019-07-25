package com.csii.ljj.io.test.decorator;

public class Concreate3 extends Decorator {
    public Concreate3(Commponent commponent) {
        super(commponent);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        this.doAnything();
    }

    public void doAnything(){
        System.out.println("C");
    }
}
