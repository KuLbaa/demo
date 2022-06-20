package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity(name = "Receptionist")
public class Receptionist extends Employee{
    int hourlyRate;
    @OneToMany
    List<Reservation> reservationList = new ArrayList<>();

    public Receptionist(String name, String surname, String PESEL, String phoneNumber, Address address, LocalDate startDate, int salary, boolean companyCar, int hourlyRate) {
        super(name, surname, PESEL, phoneNumber, address, startDate, salary, companyCar);
        this.hourlyRate = hourlyRate;
    }

    public Receptionist() {
        super();
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void addReservation(Reservation reservation){
        if(!reservationList.contains(reservation)){
            reservationList.add(reservation);

            reservation.setReceptionist(this);
        }
    }

    @Override
    public String toString() {
        return "Receptionist{" +
                "startDate=" + startDate +
                ", salary=" + salary +
                ", companyCar=" + companyCar +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
