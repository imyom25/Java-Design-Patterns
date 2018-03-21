package com.yom.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yogendra on 8/2/18.
 */
public class Employee implements Cloneable{

    private List<String> employeeList;


    public Employee() {
        employeeList = new ArrayList<String>();
    }


    public Employee(List<String> employeeData) {
        this.employeeList = employeeData;
    }

    public void loadData(){

        employeeList.add("A");
        employeeList.add("B");
        employeeList.add("C");
    }

    public List<String> getEmployeeList(){
        return  employeeList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<String>();
        for (String emp:this.employeeList) {
            tempList.add(emp);
        }
        return new Employee(tempList);
    }
}
