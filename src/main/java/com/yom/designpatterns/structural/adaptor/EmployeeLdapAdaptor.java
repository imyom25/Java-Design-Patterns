package com.yom.designpatterns.structural.adaptor;

/**
 * Created by yogendra on 26/2/18.
 */
public class EmployeeLdapAdaptor implements EmployeeDTO {

    private EmployeeFromLdap instance;

    public EmployeeLdapAdaptor(EmployeeFromLdap instance) {
        this.instance = instance;
    }


    @Override
    public String getId() {
        return instance.getEmpId();
    }

    @Override
    public String getFirstName() {
        return instance.getStartName();
    }

    @Override
    public String getLastName() {
        return instance.getEndName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    public String toString() {
        return "ID: " + instance.getEmpId() + ", First name: " + instance.getStartName() + ", Last name: " + instance
                .getEndName() + ", " +
                "Email: "
                + instance.getMail();
    }
}
