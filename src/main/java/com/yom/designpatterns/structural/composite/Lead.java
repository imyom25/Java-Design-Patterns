package com.yom.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Lead extends Employee{

    private List<Employee> employeeList = new ArrayList<>();

    public Lead(String name, Integer empId, Long salary) {
        super(name, empId, salary);
    }

    @Override
    public void add(Employee employee){
        employeeList.add(employee);
    }

    @Override
    public void remove(Employee employee){
        employeeList.remove(employee);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Lead: ");
        builder.append(name);
        builder.append(",");
        builder.append(empId);
        builder.append("... ");

        builder.append("Employees: ");

        employeeList
                .forEach(employee -> builder.append(employee.toString()));

        return builder.toString();
    }
}
