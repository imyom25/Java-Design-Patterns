package com.yom.designpatterns.behavioral.strategy;

/**
 * Created by yogendra on 19/3/18.
 */
public class NetBankingPaymentStrategy implements PaymentStrategy {

    private String netBankingDetails;

    public NetBankingPaymentStrategy(String netBankingDetails) {
        this.netBankingDetails = netBankingDetails;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+ " Paid via NetBanking");

    }
}
