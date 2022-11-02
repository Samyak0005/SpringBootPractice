package com.September01.SpringBootPractice.service;

import com.September01.SpringBootPractice.model.StudentData;
import com.September01.SpringBootPractice.repository.StudentJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentDbService {

    @Autowired
    StudentJpaRepo studentJpaRepo;
    public String AddStudentData(StudentData studentData){

        studentJpaRepo.save(studentData);
        return "Add data Successfully";
    }

    public List<StudentData> getStudentData(){

       return studentJpaRepo.findAll();
    }

    public String updateStudentData(long id ,String name ){

        StudentData studentData = studentJpaRepo.getReferenceById(id);
        studentData.setName(name);
        studentJpaRepo.save(studentData);

        return "Update student data Successfully";
    }

    public String deletestudentData( long id ){

        studentJpaRepo.deleteById(id);
        return "Delete data Successfully";
    }
}
