package com.example.demo;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity(name = "Owner")
public class Owner extends Employee{


    public Owner(String name, String surname, String PESEL, String phoneNumber, Address address, LocalDate startDate, int salary, boolean companyCar) {
        super(name, surname, PESEL, phoneNumber, address, startDate, salary, companyCar);
    }


    public Owner() {}
}
