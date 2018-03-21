package com.yom.designpatterns.behavioral.chain;

public class BillingSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.BILLING) {
            System.out.println("Working on Billing Related Query of Customer: " + request.getMessage());
        } else {
            supportHandler.handleRequest(request);
        }
    }
}
