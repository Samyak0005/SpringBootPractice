package com.September01.SpringBootPractice.controller;

import com.September01.SpringBootPractice.model.CarEquality;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@RestController
public class HashSetController {


    HashSet< CarEquality> CreateCarList = new HashSet<>();
   @PostMapping("/add_List")
    public String AddCar(@RequestBody CarEquality car){

                CreateCarList.add(car);
                return "Add in List Successfully";
    }

    @GetMapping("/get_List")
    public HashSet< CarEquality> GetCar(){

        return CreateCarList;
    }

    @PutMapping("/get_Update/{index}/{name}")
    public String updateCar(@PathVariable int index, @PathVariable String name){

        List<CarEquality> check = new ArrayList<>(CreateCarList);
        check.get(index).setName(name);

        return "Update data Successfully";
    }
}
