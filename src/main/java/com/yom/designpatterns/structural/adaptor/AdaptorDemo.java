package com.yom.designpatterns.structural.adaptor;

import java.util.List;

/**
 * Created by yogendra on 25/2/18.
 */
public class AdaptorDemo {

    public static void main(String[] args) {

        EmployeeClient employeeClient = new EmployeeClient();

        List<EmployeeDTO> employeeDTOList = employeeClient.getEmployeeList();
        System.out.println(employeeDTOList);

    }
}
