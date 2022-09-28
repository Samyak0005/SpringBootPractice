package com.September01.SpringBootPractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReqParamController {

    @RequestMapping("/city")
    public  String AddCity(@RequestParam String name){

        return "this is my city "+name;
    }

    @RequestMapping("/square")
    public String Square(@RequestParam int n){

        return "Square  :"+n*n;
    }

}
