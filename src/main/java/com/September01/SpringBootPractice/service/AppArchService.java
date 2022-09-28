package com.September01.SpringBootPractice.service;

import com.September01.SpringBootPractice.repository.AppArchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AppArchService {

    @Autowired
    AppArchRepo obj;

    public String Response(@PathVariable int age){

        return obj.Response(age);
    }
}
