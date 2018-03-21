package com.yom.designpatterns.structural.facade;

/**
 * Created by yogendra on 1/3/18.
 */
public class FacadeDemo {

    public static void main(String[] args) {

        BankingServiceFacade bankingService = new BankingServiceFacadeImpl();
        bankingService.transferMoney();

    }
}
