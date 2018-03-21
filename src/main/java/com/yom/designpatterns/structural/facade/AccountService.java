package com.yom.designpatterns.structural.facade;

/**
 * Created by yogendra on 1/3/18.
 */
public class AccountService {

    public static Account getAccount(String accountId) {
        return new SavingsAccount();
    }
}
