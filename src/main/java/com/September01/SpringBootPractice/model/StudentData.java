package com.September01.SpringBootPractice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "KP_College")
public class StudentData {
    @Id
    @GeneratedValue
    long id;

    String name;
    int age;
    String Section;

    //default const

    public StudentData() {
    }

    //Parameterized Const


    public StudentData(String name, int age, String section) {
        this.name = name;
        this.age = age;
       this.Section = section;
    }

    //Getter and Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }
}
