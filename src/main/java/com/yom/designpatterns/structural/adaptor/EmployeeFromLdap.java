package com.yom.designpatterns.structural.adaptor;

/**
 * Created by yogendra on 26/2/18.
 */
public class EmployeeFromLdap {

    private String empId;
    private String startName;
    private String endName;
    private String mail;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getStartName() {
        return startName;
    }

    public void setStartName(String startName) {
        this.startName = startName;
    }

    public String getEndName() {
        return endName;
    }

    public void setEndName(String endName) {
        this.endName = endName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public EmployeeFromLdap(String empId, String startName, String endName, String mail) {
        this.empId = empId;
        this.startName = startName;
        this.endName = endName;
        this.mail = mail;
    }


    @Override
    public String toString() {
        return "EmployeeFromLdap{" +
                "empId='" + empId + '\'' +
                ", startName='" + startName + '\'' +
                ", endName='" + endName + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
