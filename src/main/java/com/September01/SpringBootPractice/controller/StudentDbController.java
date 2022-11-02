package com.September01.SpringBootPractice.controller;

import com.September01.SpringBootPractice.model.StudentData;
import com.September01.SpringBootPractice.service.StudentDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDbController {

    @Autowired
    StudentDbService studentDbService;

    @PostMapping("/addkpstudent")
    public String AddStudentData(@RequestBody StudentData studentData){

        return studentDbService.AddStudentData(studentData);
    }

    @GetMapping("/getkpstudent")
    public List<StudentData> getStudentData(){

        return studentDbService.getStudentData();
    }

    @PutMapping("/update_kp_student/{id}/{name}")
    public String updateStudentData(@PathVariable long id , @PathVariable String name ){

        return studentDbService.updateStudentData(id,name);
    }

    @DeleteMapping("/deletekpstudent")
    public String deletestudentData(@RequestParam long id ){

        return studentDbService.deletestudentData(id);

    }
}
