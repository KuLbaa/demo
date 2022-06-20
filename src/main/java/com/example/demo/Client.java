package com.example.demo;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity(name = "Client")
public class Client extends Person {
    int age;
    int numberOfRentedCars;
    //@OneToMany
    //List<Reservation> reservationList = new ArrayList<>();
    //private Long id;


    public Client(String name, String surname, String PESEL, String phoneNumber, Address address) {
        super(name, surname, PESEL, phoneNumber, address);
    }

    public Client(String name, String surname, String PESEL, String phoneNumber, Address address, Reservation reservation) {
        super(name, surname, PESEL, phoneNumber, address);
        //addReservation(reservation);
    }

    public Client() {
        super();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfRentedCars() {
        return numberOfRentedCars;
    }

    public void setNumberOfRentedCars(int numberOfRentedCars) {
        this.numberOfRentedCars = numberOfRentedCars;
    }

    /*public void addReservation(Reservation reservation){
        if(!reservationList.contains(reservation)){
            reservationList.add(reservation);

            reservation.setClient(this);
        }
    }*/

    @Override
    public String toString() {
        return "Client{" +
                "age=" + age +
                ", numberOfRentedCars=" + numberOfRentedCars +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
    }


    //@Id
    //@GeneratedValue(generator="increment")
    //@GenericGenerator(name="increment", strategy = "increment")
    //public Long getId() {
        //return id;
    //}
}
