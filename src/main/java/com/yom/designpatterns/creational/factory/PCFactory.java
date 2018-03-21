package com.yom.designpatterns.creational.factory;

/**
 * Created by yogendra on 10/2/18.
 */
public class PCFactory implements ComputerAbstractFactory {

    private String hdd;
    private String cpu;
    private String ram;

    public PCFactory(String hdd, String cpu, String ram) {
        this.hdd = hdd;
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new PC(hdd, cpu, ram);
    }
}
