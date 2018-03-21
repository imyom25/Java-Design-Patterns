package com.yom.designpatterns.structural.flyweight;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by yogendra on 2/3/18.
 */
@Setter
@Getter
public class Manager implements Employee {

    public Manager(String department) {
        super();
        this.department = department;
    }

    private String department;
    private Integer salary;

    @Override
    public void work() {

        System.out.println("Manager of department "+ department+ " is taking salary "+salary);
    }
}
