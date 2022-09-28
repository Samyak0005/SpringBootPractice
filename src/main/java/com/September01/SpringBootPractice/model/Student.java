package com.September01.SpringBootPractice.model;

public class Student {

    String name;
    int roll_no;
    String section;

    public Student(String name, int roll_no, String Section) {
        this.name = name;
        this.roll_no = roll_no;
        section = Section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String Section) {
        section = Section;
    }
}
