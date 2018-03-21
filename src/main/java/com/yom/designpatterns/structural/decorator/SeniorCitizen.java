package com.yom.designpatterns.structural.decorator;

/**
 * Created by yogendra on 1/3/18.
 */
public class SeniorCitizen extends AccountDecorator {

    Account account;

    public SeniorCitizen(Account account) {
        super();
        this.account = account;
    }

    @Override
    public String getTotalBenefits() {
        return account.getTotalBenefits() + "and extra benefit of "+ applyExtraBenefits();
    }

    @Override
    String applyExtraBenefits() {

        return "an accident insurance of up to 75,000 INR";
    }
}
