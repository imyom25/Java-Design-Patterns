package com.yom.designpatterns.behavioral.command;

/**
 * Created by yogendra on 10/3/18.
 */
public class CommandPatternDemo {

    public static void main(String[] args) {

        Account account = new Account();

        OpenAccount openAccount = new OpenAccount(account);
        CloseAccount closeAccount = new CloseAccount(account);

        Bank bank = new Bank();
        bank.takeCommand(openAccount);
        bank.takeCommand(closeAccount);

        bank.executeCommand();

    }
}
