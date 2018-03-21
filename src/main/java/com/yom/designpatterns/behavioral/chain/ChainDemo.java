package com.yom.designpatterns.behavioral.chain;

public class ChainDemo {

    public static void main(String[] args) {

        TechnicalSupportHandler technicalSupportHandler = new TechnicalSupportHandler();
        BillingSupportHandler billingSupportHandler = new BillingSupportHandler();
        GeneralSupportHandler generalSupportHandler = new GeneralSupportHandler();

        generalSupportHandler.setNextHandler(technicalSupportHandler);
        technicalSupportHandler.setNextHandler(billingSupportHandler);

        Request request1 = new Request(RequestType.GENERAL, "Need New Laptop details");
        generalSupportHandler.handleRequest(request1);

        Request request2 = new Request(RequestType.TECHNICAL, "Issue in Laptop Configuration");
        generalSupportHandler.handleRequest(request2);

        Request request3 = new Request(RequestType.BILLING, "Need New Laptop Price Info");
        generalSupportHandler.handleRequest(request3);


    }
}
