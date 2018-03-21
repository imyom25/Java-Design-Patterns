package com.yom.designpatterns.structural.decorator;

/**
 * Created by yogendra on 1/3/18.
 */
public class Privilege extends AccountDecorator {

    Account account;

    public Privilege(Account account) {
        super();
        this.account = account;
    }

    @Override
    public String getTotalBenefits() {
        return account.getTotalBenefits() + "and extra benefit of "+ applyExtraBenefits();
    }

    @Override
    String applyExtraBenefits() {
        return "an accident insurance of up to 50,000 INR";
    }
}
