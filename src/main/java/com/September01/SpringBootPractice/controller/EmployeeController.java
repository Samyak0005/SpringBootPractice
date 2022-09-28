package com.September01.SpringBootPractice.controller;

import com.September01.SpringBootPractice.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.Remote;
import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee>  CreateEmployeeList = new ArrayList<>();

    @RequestMapping("/addList")
    public String AddList(){

        Employee Employee1 = new Employee("Samyak",101,"IT");
        Employee Employee2 = new Employee("Rohit",102,"CS");
        Employee Employee3 = new Employee("Gaurav",103,"ME");

        CreateEmployeeList.add(Employee1);
        CreateEmployeeList.add(Employee2);
        CreateEmployeeList.add(Employee3);

        return "Add Data successfully";
    }

    @RequestMapping("/getList")
    public  ArrayList<Employee> getData(){

        return CreateEmployeeList;
    }

    @RequestMapping("/updateList/{index}/{name}/{dept}")

    public String UpdateData(@PathVariable int index, @PathVariable String name, @PathVariable String dept){

        CreateEmployeeList.get(index).setName(name);
        CreateEmployeeList.get(index).setDept(dept);

        return "Update Data in List Successfully";
    }

    @RequestMapping("/removeList")

    public String RemoveData(@RequestParam int index){

        CreateEmployeeList.remove(index);

        return "Remove Data is Successfully";
    }

}
