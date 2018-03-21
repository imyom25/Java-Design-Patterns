package com.yom.designpatterns.structural.decorator;

/**
 * Created by yogendra on 1/3/18.
 */
public class CurrentAccount implements Account {
    @Override
    public String getTotalBenefits() {
        return "This Account won't give any interest";
    }
}
