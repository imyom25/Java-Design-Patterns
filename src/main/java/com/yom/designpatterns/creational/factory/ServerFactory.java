package com.yom.designpatterns.creational.factory;

/**
 * Created by yogendra on 10/2/18.
 */
public class ServerFactory implements ComputerAbstractFactory {

    private String hdd;
    private String cpu;
    private String ram;

    public ServerFactory(String hdd, String cpu, String ram) {
        this.hdd = hdd;
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new Server(hdd, cpu, ram);
    }
}