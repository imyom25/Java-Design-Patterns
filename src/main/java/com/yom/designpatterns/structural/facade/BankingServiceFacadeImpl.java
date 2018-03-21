package com.yom.designpatterns.structural.facade;

/**
 * Created by yogendra on 1/3/18.
 */
public class BankingServiceFacadeImpl implements BankingServiceFacade {

    @Override
    public void transferMoney() {

        boolean isSuccessFromPaymentGateway = PaymentGatewayService.doPayment();

        if(isSuccessFromPaymentGateway){

            Account senderAccount = AccountService.getAccount("1");
            System.out.println("Got Sender Account");

            Account receiverAccount = AccountService.getAccount("1");
            System.out.println("Got Receiver Account");

            System.out.println("Success from Payment Gateway? "+isSuccessFromPaymentGateway);

            TransferService.transfer(1000, senderAccount, receiverAccount);
        }

    }
}
