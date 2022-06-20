package com.example.demo;
import com.sun.istack.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@MappedSuperclass
public abstract class Person {
    @NotNull
    String name;
    @NotNull
    String surname;
    @Id
    @NotNull
    String pesel;
    @NotNull
    String phoneNumber;
    @ManyToOne
    Address address;

    public Person(String name, String surname, String pesel, String phoneNumber, Address address) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.phoneNumber = phoneNumber;
        setAddress(address);
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if(this.address != address){
            this.address = address;
            address.addPerson(this);
        }
    }
}
