package com.yom.designpatterns.structural.facade;

/**
 * Created by yogendra on 1/3/18.
 */
public class SavingsAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}
