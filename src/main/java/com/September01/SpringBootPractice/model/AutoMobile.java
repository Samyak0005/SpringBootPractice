package com.September01.SpringBootPractice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AutoMobile {

    @Id
    @GeneratedValue
     long chassis;

    String CarName;
    float mfy;
    long price;

    //Default Const

    public AutoMobile() {
    }
    // Parametrized const


    public AutoMobile(String CarName, float mfy, long price) {
        CarName = CarName;
        this.mfy = mfy;
        this.price = price;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String CarName) {
        CarName = CarName;
    }

    public float getMfy() {
        return mfy;
    }

    public void setMfy(float mfy) {
        this.mfy = mfy;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
