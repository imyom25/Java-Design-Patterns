package com.yom.designpatterns.creational.factory;

/**
 * Created by yogendra on 10/2/18.
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String hdd, String cpu, String ram){

        switch (type){

            case "PC":
             return new PC(hdd, cpu, ram);

            case "Server":
                return new Server(hdd, cpu, ram);

        }
        return null;
    }


    public static Computer getComputer(ComputerAbstractFactory factory){

        return factory.createComputer();
    }

}
