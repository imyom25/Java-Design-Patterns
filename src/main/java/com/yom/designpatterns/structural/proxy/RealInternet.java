package com.yom.designpatterns.structural.proxy;

/**
 * Created by yogendra on 2/3/18.
 */
public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to "+ serverHost);
    }
}
