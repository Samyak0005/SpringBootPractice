package com.September01.SpringBootPractice.controller;

import com.September01.SpringBootPractice.repository.AppArchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppArchController {

    @Autowired
    AppArchRepo obj;

    @RequestMapping("/response/{age}")
    public String Response(@PathVariable int age){
        return obj.Response(age);
    }
}
