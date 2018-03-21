package com.yom.designpatterns.creational.prototype;

import java.util.List;

/**
 * Created by yogendra on 8/2/18.
 */
public class PrototypeTestApplication {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee = new Employee();
        employee.loadData();

        Employee employee1 = (Employee) employee.clone();
        List<String> employee1List = employee1.getEmployeeList();
        employee1List.add("D");

        Employee employee2 = (Employee) employee.clone();
        List<String> employee2List = employee2.getEmployeeList();
        employee2List.remove("B");

        System.out.println("original employee: "+employee.getEmployeeList());
        System.out.println("clone 1 of employee: "+employee1.getEmployeeList());
        System.out.println("clone 2 of employee: "+employee2.getEmployeeList());
    }
}
