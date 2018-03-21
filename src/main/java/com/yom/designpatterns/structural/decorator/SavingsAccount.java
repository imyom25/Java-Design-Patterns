package com.yom.designpatterns.structural.decorator;

/**
 * Created by yogendra on 1/3/18.
 */
public class SavingsAccount implements Account {
    @Override
    public String getTotalBenefits() {
        return "This Account will give 4% interest";
    }
}
