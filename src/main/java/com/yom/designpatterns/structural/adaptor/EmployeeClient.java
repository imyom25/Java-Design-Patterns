package com.yom.designpatterns.structural.adaptor;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by yogendra on 25/2/18.
 */
public class EmployeeClient {

    public List<EmployeeDTO> getEmployeeList(){

        List<EmployeeDTO> employeeDTOS = new ArrayList<>();
        EmployeeDTO employeeDTOFromDB = new EmployeeDB("1","Yogendra","Mishra","yom@acb.com");

        employeeDTOS.add(employeeDTOFromDB);

        EmployeeFromLdap employeeFromLdap = new EmployeeFromLdap("2","Sachin","Mishra","sachin@acb.com");

        employeeDTOS.add(new EmployeeLdapAdaptor(employeeFromLdap));

        return employeeDTOS;
    }
}
