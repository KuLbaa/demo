package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Driver")
public class Driver extends Employee{
    int bonus;
    @OneToMany
    List<Reservation> reservationList = new ArrayList<>();

    public Driver(String name, String surname, String PESEL, String phoneNumber, Address address, LocalDate startDate, int salary, boolean companyCar, int bonus) {
        super(name, surname, PESEL, phoneNumber, address, startDate, salary, companyCar);
        this.bonus = bonus;
    }

    public Driver() {

    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void addReservation(Reservation reservation){
        if(!reservationList.contains(reservation)){
            reservationList.add(reservation);

            reservation.setDriver(this);
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "bonus=" + bonus +
                ", startDate=" + startDate +
                ", salary=" + salary +
                ", companyCar=" + companyCar +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
