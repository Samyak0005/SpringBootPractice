package com.September01.SpringBootPractice.controller;

import com.September01.SpringBootPractice.model.AutoMobile;
import com.September01.SpringBootPractice.service.CarDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarDbController {

    @Autowired
    CarDbService carDbService;

    @PostMapping("/add_db_car")
    public String AddCarList(@RequestBody AutoMobile autoMobile){

       return carDbService.AddCarList(autoMobile);
    }

    @GetMapping("/get_db_car")
    public List<AutoMobile> getCarList(){

       return carDbService.getCarList();
    }

    @PutMapping("/update_db_car/{chassis}/{CarName}")

    public String updateCarList(@PathVariable long chassis, @PathVariable String CarName){

        return carDbService.updateCarList(chassis,CarName);
    }

    @DeleteMapping("/delete_db_car")

    public String deleteCarList(@RequestParam long chassis){

        return carDbService.deleteCarList(chassis);
    }
}
