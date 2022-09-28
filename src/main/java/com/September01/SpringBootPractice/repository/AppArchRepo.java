package com.September01.SpringBootPractice.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class AppArchRepo {


    public String Response(@PathVariable int age){

        if (age>18){
            return "Eligible for Voting";
        }
        else {
            return "Not Eligible for Voting";
        }
    }
}
