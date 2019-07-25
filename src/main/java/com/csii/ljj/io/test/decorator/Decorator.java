package com.csii.ljj.io.test.decorator;

public class Decorator implements Commponent {
    private Commponent commponent ;

    public Decorator(Commponent commponent){
        this.commponent = commponent;
    }
    @Override
    public void doSomething() {
        commponent.doSomething();
    }
}
