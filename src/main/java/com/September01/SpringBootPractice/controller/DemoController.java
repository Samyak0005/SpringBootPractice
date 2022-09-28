package com.September01.SpringBootPractice.controller;

import com.September01.SpringBootPractice.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController {

    @RequestMapping("/first_Demo")
  public String m1(){

      int a = 23;
      int b = 56;
      int c = a+b;
      return "print sum of a and b"+c;
  }
  @RequestMapping("/hello")
  public void m2(){

      System.out.println("Hello Spring boot");
  }
    @RequestMapping("/AddEmployee")
    public Employee AddEmployee(){

        ArrayList<Employee> Emp = new ArrayList<>();

        Employee obj = new Employee("Samyak",101,"CS");
        Employee obj1 = new Employee("Rohit",102,"ME");
        Employee obj2 = new Employee("Gaurav",103,"CE");

        Emp.add(obj);
        Emp.add(obj1);
        Emp.add(obj2);

        return Emp.get(0);

    }

}
