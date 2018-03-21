package com.yom.designpatterns.creational.factory;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by yogendra on 10/2/18.
 */
public class AbstractFactoryApp {


    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer(new PCFactory("1TB","2.7GHz","8GB"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("10TB","2.9GHz","16GB"));

        System.out.println("PC config "+pc.toString());
        System.out.println("Server config "+server.toString());



    }
}
