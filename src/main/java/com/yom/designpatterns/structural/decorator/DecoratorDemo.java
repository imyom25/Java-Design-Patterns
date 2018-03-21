package com.yom.designpatterns.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        Account savingAccount =  new SavingsAccount();
        System.out.println(savingAccount.getTotalBenefits());

        Account privilegeSavingAccount = new SavingsAccount();
        privilegeSavingAccount = new Privilege(privilegeSavingAccount);
        System.out.println(privilegeSavingAccount.getTotalBenefits());

        Account seniorCitizenSavingAccount = new SavingsAccount();
        seniorCitizenSavingAccount = new SeniorCitizen(seniorCitizenSavingAccount);
        System.out.println(seniorCitizenSavingAccount.getTotalBenefits());

    }

}
