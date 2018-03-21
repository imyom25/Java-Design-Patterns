package com.yom.designpatterns.behavioral.chain;

public class GeneralSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.GENERAL) {
            System.out.println("Handling General Query: " + request.getMessage());
        } else {
            supportHandler.handleRequest(request);
        }

    }
}
