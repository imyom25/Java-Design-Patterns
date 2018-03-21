package com.yom.designpatterns.structural.bridge;

/**
 * Created by yogendra on 26/2/18.
 */
public class AxisBank extends Bank {


    public AxisBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {

        System.out.println("Open Your Account with Axis Bank");
        return account;
    }
}
