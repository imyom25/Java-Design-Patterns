package com.yom.designpatterns.behavioral.strategy;

/**
 * Created by yogendra on 19/3/18.
 */
public class UpiPaymentStrategy implements PaymentStrategy {

    private String upiDetails;

    public UpiPaymentStrategy(String upiDetails) {
        this.upiDetails = upiDetails;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+ " Paid via UPI");
    }
}
