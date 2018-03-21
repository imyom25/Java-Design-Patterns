package com.yom.designpatterns.creational.factory;

/**
 * Created by yogendra on 9/2/18.
 */
public class PC extends Computer {

    private String hdd;
    private String cpu;
    private String ram;

    public PC(String hdd, String cpu, String ram) {
        this.hdd = hdd;
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    String getHDD() {
        return this.hdd;
    }

    @Override
    String getCPU() {
        return this.cpu;
    }

    @Override
    String getRAM() {
        return this.ram;
    }

}
