package com.September01.SpringBootPractice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "TCS_EMPLOYEE")
public class EmployeeData {

    @Id
    @GeneratedValue
    long id;

    String name ;
    String dept;
    long salary;

    //Default Cons

    public EmployeeData() {
    }

    //Construtors


    public EmployeeData(long id, String name, String dept, long salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    // getter and Setter


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
