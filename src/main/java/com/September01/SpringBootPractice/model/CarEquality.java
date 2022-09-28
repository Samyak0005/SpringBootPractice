package com.September01.SpringBootPractice.model;

import java.util.Objects;

public class CarEquality {

    String name;
    double price;
    int model;

    public CarEquality(String name, double price, int model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarEquality)) return false;
        CarEquality car = (CarEquality) o;
        return Double.compare(car.getPrice(), getPrice()) == 0 && getModel() == car.getModel() && getName().equals(car.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getModel());
    }
}


