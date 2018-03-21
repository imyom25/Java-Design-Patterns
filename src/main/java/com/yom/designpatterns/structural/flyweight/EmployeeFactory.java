package com.yom.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yogendra on 2/3/18.
 */
public class EmployeeFactory {

    private static Map<String, Employee> employeeMap = new HashMap<>();


    public static Employee getEmployee(String department){

        if(!employeeMap.containsKey(department)) {
            employeeMap.put(department, new Manager(department));
            System.out.println("Creating Manager for " + department);
        }
            return employeeMap.get(department);

    }
}
