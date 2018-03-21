package com.yom.designpatterns.structural.adaptor;

/**
 * Created by yogendra on 25/2/18.
 */
public class EmployeeDB implements EmployeeDTO {

    public EmployeeDB(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    private String id;
    private String firstName;
    private String lastName;
    private String email;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }
    public String toString() {
        return "ID: " + id + ", First name: " + firstName + ", Last name: " + lastName + ", Email: " + email;
    }
}
