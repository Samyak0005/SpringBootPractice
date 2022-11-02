package com.September01.SpringBootPractice.controller;

import com.September01.SpringBootPractice.model.EmployeeData;
import com.September01.SpringBootPractice.repository.EmployeeJpaRepo;
import com.September01.SpringBootPractice.service.EmployeeDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDbController {

    @Autowired
    EmployeeDbService employeeDbService;

    @PostMapping("/add_db_employee")
    public String AddEmployee(@RequestBody EmployeeData employeeData) {

        return employeeDbService.AddEmployee(employeeData);
    }

    @GetMapping("/get_db_employee")
    public List<EmployeeData> getEmployee() {

        return employeeDbService.getEmployee();
    }

    @PutMapping("/update_db_employee/{id}/{name}")

    public String updateEmpList(@PathVariable long id, @PathVariable String name) {

        return employeeDbService.updateEmpList(id, name);
    }

    @DeleteMapping("/delete_db_employee")

    public String deleteList(@RequestParam long id) {

        return employeeDbService.deleteList(id);
    }

    @GetMapping("/findbyname")
    public EmployeeData findByName(@RequestParam String name) {

        return employeeDbService.findByName(name);
    }
    @GetMapping("/findbydept")
    public List<EmployeeData> findByDept(@RequestParam String dept){

        return employeeDbService.findByDept(dept);
    }


}