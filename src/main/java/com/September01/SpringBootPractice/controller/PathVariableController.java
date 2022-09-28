package com.September01.SpringBootPractice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @RequestMapping("/square/{n}")
    public String Square(@PathVariable int n){

        return "Square  :"+(n*n);

    }
    @RequestMapping("/cube/{n}")
    public String Qube(@PathVariable int n){

        return "cube  :"+(n*n*n);
    }

    @RequestMapping("/check/{a}")

    public String CheckVariable(@PathVariable int a){

        if (a%2==0){

            return "Even  :"+a;
        }

        else {
            return "Odd  :"+a;
        }
    }
    @RequestMapping("/add/{a}/{b}")
    public String Add(@PathVariable int a, @PathVariable int b ) {


        return "Addition :  "+ (a + b);

    }
    @RequestMapping("/sub/{a}/{b}")
    public String Sub(@PathVariable int a, @PathVariable int b) {

        int c = a-b;
        return "Subtracted : " + c;

    }
    @RequestMapping("/mul/{a}/{b}")
    public String Mul(@PathVariable int a,@PathVariable int b){

        int c = a*b;
        return "Multiple  :"+c;
    }
    @RequestMapping("/div/{a}/{b}")
    public String Div(@PathVariable int a, @PathVariable int b){

        Float MyFloat = (float)a/b;

        return "Divide  :"+MyFloat;
    }
}
