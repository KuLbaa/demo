package com.example.demo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Car")
public class Car {
    String make;
    String model;
    String productionYear;
    int power;
    String color;
    int price;
    @OneToMany
    List<InsurancePolicy> insurancePolicyList = new ArrayList<>();
    @OneToMany
    List<Reservation> reservationList = new ArrayList<>();
    private Long id;

    public Car(String make, String model, String productionYear, int power, String color, int price) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.power = power;
        this.color = color;
        this.price = price;
    }

    public Car() {}

    @Basic
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Basic
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    @Basic
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Basic
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addReservation(Reservation reservation){
        if(!reservationList.contains(reservation)){
            reservationList.add(reservation);

            reservation.setCar(this);
        }
    }

    public void addInsurancePolicy(InsurancePolicy insurancePolicy){
        if(!insurancePolicyList.contains(insurancePolicy)){
            insurancePolicyList.add(insurancePolicy);

            insurancePolicy.setCar(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", insurancePolicyList=" + insurancePolicyList +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    public Long getId() {
        return id;
    }
}
