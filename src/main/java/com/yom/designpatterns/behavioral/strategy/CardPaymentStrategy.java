package com.yom.designpatterns.behavioral.strategy;

/**
 * Created by yogendra on 19/3/18.
 */
public class CardPaymentStrategy implements PaymentStrategy {

    private String cardDetails;

    public CardPaymentStrategy(String cardDetails) {
        this.cardDetails= cardDetails;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" Paid via Card");
    }
}
