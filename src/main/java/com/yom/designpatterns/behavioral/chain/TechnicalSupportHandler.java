package com.yom.designpatterns.behavioral.chain;


public class TechnicalSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(Request request) {

        if (request.getRequestType() == RequestType.TECHNICAL) {
            System.out.println("Working on Technical Query of Customer: " + request.getMessage());
        } else {
            supportHandler.handleRequest(request);
        }
    }
}
