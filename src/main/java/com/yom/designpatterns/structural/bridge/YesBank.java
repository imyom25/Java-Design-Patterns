package com.yom.designpatterns.structural.bridge;

/**
 * Created by yogendra on 26/2/18.
 */
public class YesBank extends Bank {


    public YesBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {

        System.out.println("Open Your Account with Yes Bank");
        return account;
    }
}
