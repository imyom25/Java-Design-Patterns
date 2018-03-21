package com.yom.designpatterns.structural.proxy;

/**
 * Created by yogendra on 2/3/18.
 */
public class ProxyDemo {

    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("Google.com");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
