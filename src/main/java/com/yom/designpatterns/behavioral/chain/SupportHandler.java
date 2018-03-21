package com.yom.designpatterns.behavioral.chain;


public abstract class SupportHandler {

    protected SupportHandler supportHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.supportHandler = nextHandler;
    }

    public abstract void handleRequest(Request request);
}
