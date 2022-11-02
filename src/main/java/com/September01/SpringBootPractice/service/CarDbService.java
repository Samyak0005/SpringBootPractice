package com.September01.SpringBootPractice.service;

import com.September01.SpringBootPractice.model.AutoMobile;
import com.September01.SpringBootPractice.repository.CarJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CarDbService {

    @Autowired
    CarJpaRepo carJpaRepo;

    public String AddCarList(AutoMobile autoMobile){

        carJpaRepo.save(autoMobile);
        return "Add data in Automobile";
    }

    public List<AutoMobile> getCarList(){

        return carJpaRepo.findAll();
    }

    public String updateCarList(long chassis, String CarName, float mfy){

        AutoMobile autoMobile = carJpaRepo.getById(chassis);
        autoMobile.setCarName(CarName);
        autoMobile.setMfy(mfy);
        carJpaRepo.save(autoMobile);
        return "Update data Successfully";
    }

    public String deleteCarList(long chassis){

        carJpaRepo.deleteById(chassis);
        return "Delete data Successfully";
    }
}
