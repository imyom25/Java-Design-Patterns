package com.yom.designpatterns.structural.bridge;

/**
 * Created by yogendra on 26/2/18.
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("OPENED: SAVING ACCOUNT");
        return new CurrentAccount();
    }

    @Override
    public void accountType() {
        System.out.println("## This is a Saving Account ##");
    }
}
