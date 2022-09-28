package com.September01.SpringBootPractice.controller;

import com.September01.SpringBootPractice.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class StudentController {

    ArrayList<Student> createStudentList = new ArrayList<>();
    @RequestMapping(value = "/addStudentList",method = RequestMethod.POST)
    public String AddList(@RequestBody Student student){

        createStudentList.add(student);
        return "Add data in list Successfully";

    }
    @RequestMapping(value = "/getStudentList",method = RequestMethod.GET)
    public ArrayList<Student> GetList(){

        return createStudentList;
    }

    @RequestMapping(value = "/updateStudentList/{index}/{name}", method = RequestMethod.PUT)
    public String updateList(@PathVariable int index, @PathVariable String name){

        createStudentList.get(index).setName(name);
        return "Update data in list Successfully";

    }

    @RequestMapping(value = "/removeStudentList", method = RequestMethod.DELETE)
    public String removeList(@RequestParam int index){

        createStudentList.remove(index);

        return "Remove data in list Successfully";
    }


}
