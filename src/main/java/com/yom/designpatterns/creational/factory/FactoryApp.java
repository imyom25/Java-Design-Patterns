package com.yom.designpatterns.creational.factory;

/**
 * Created by yogendra on 10/2/18.
 */
public class FactoryApp {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("PC", "500GB","2.4 GHz","8GB");
        Computer server = ComputerFactory.getComputer("Server","1TB","2.9 GHz","16GB");

        System.out.println("PC config "+pc.toString());
        System.out.println("Server config "+server.toString());

    }
}
