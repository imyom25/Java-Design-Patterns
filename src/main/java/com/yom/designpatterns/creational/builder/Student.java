package com.yom.designpatterns.creational.builder;

/**
 * Created by yogendra on 3/2/18.
 */
public class Student {

    private int id;
    private String name;
    private String branch;
    private int rollNo;
    private String sportsQuota;

    private Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.branch = studentBuilder.branch;
        this.rollNo = studentBuilder.rollNo;
        this.sportsQuota = studentBuilder.sportsQuota;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getSportsQuota() {
        return sportsQuota;
    }


    public static class StudentBuilder {

        private int id;
        private String name;
        private String branch;
        private int rollNo;
        private String sportsQuota;

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public StudentBuilder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public StudentBuilder setSportsQuota(String sportsQuota) {
            this.sportsQuota = sportsQuota;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }


}
