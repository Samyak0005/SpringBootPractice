package com.September01.SpringBootPractice.service;

import com.September01.SpringBootPractice.model.EmployeeData;
import com.September01.SpringBootPractice.repository.EmployeeJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EmployeeDbService {

    @Autowired
    EmployeeJpaRepo employeeJpaRepo;

    public String AddEmployee(EmployeeData employeeData) {

        employeeJpaRepo.save(employeeData);
        return "Successfully add data";

    }

    public List<EmployeeData> getEmployee() {
        return employeeJpaRepo.findAll();

    }

    public String updateEmpList(long id, String name) {

        //Step :1 Find the object in Database
       EmployeeData employeeData = employeeJpaRepo.getReferenceById(id);
        // step :2   set name
     employeeData.setName(name);
        // step :3 save the object
        employeeJpaRepo.save(employeeData);

        return "Successfully update data";
    }

    public String deleteList(Long id) {

        employeeJpaRepo.deleteById(id);
        return "Delete data in database successfully";
    }
}