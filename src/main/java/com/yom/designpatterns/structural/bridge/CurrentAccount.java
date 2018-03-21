package com.yom.designpatterns.structural.bridge;

/**
 * Created by yogendra on 26/2/18.
 */
public class CurrentAccount implements Account {


    @Override
    public Account openAccount() {
        System.out.println("OPENED: CURRENT ACCOUNT");
        return new CurrentAccount();
    }

    @Override
    public void accountType() {
        System.out.println("## This is a Current Account ##");
    }
}
