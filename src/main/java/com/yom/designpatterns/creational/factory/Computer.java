package com.yom.designpatterns.creational.factory;

/**
 * Created by yogendra on 9/2/18.
 */
public abstract class Computer {

    abstract String getHDD();
    abstract String getCPU();
    abstract String getRAM();

    @Override
    public String toString() {
        return "RAM : "+this.getRAM() +", CPU : "+this.getCPU()+ ", HDD : "+getHDD();
    }

}
