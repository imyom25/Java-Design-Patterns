package com.yom.designpatterns.structural.flyweight;

/**
 * Created by yogendra on 2/3/18.
 */
public class FlyweightPatternDemo {

    private static final String departments[] = { "IT", "ME", "EE", "CO", "PWD", "NR", "ST", "IAS"};

    public static void main(String[] args) {

        for(int i=0; i < 8; ++i) {
            Manager manager = (Manager)EmployeeFactory.getEmployee(getRandomDepartment());
            manager.setSalary(getRandomSalary());
            manager.work();
        }
    }
    private static String getRandomDepartment() {
        return departments[(int)(Math.random()*departments.length)];
    }

    private static int getRandomSalary() {
        return (int)(Math.random()*100000);
    }
}
