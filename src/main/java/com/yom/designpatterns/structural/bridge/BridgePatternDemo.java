package com.yom.designpatterns.structural.bridge;

/**
 * Created by yogendra on 26/2/18.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {

        Bank axisBank = new AxisBank(new SavingAccount());
        Account savingAccount = axisBank.openAccount();
        savingAccount.accountType();

        Bank yesBank = new YesBank(new CurrentAccount());
        Account currentAccount = yesBank.openAccount();
        currentAccount.accountType();


    }
}
