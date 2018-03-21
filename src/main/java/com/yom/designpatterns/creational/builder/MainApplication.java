package com.yom.designpatterns.creational.builder;

import java.util.logging.Logger;

/**
 * Created by yogendra on 3/2/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        Student student = new Student.StudentBuilder().setId(1).setName("Yogendra").setRollNo(25)
                                                      .setBranch("IT").setSportsQuota("YES").build();
        System.out.println("Student Name: "+ student.getName());

    }
}
