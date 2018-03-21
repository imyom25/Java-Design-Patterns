package com.yom.designpatterns.structural.bridge;

/**
 * Created by yogendra on 26/2/18.
 */
public abstract class Bank {

    protected Account account;


    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
