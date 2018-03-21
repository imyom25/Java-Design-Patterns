package com.yom.designpatterns.behavioral.command;

/**
 * Created by yogendra on 10/3/18.
 */
public class OpenAccount implements Command {

    private Account bankAccount;

    public OpenAccount(Account bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void execute() {
        bankAccount.openAccount();
    }
}
