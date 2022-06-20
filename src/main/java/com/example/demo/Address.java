package com.example.demo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Address")
public class Address {
    String country;
    String city;
    String street;
    @OneToMany
    private List<Department> departmentList = new ArrayList<>();
    @OneToMany
    private List<Person> personList = new ArrayList<>();
    @OneToMany
    private List<Reservation> reservationList = new ArrayList<>();
    static List<Address> extent = new ArrayList<>();
    private Long id;

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
        extent.add(this);
    }

    public Address() {}

    @Basic
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void addDepartment(Department department){
        if(!departmentList.contains(department)) {
            departmentList.add(department);
            department.setAddress(this);
        }
    }

    public void addReservation(Reservation reservation){
        if(!reservationList.contains(reservation)){
            reservationList.add(reservation);
            reservation.setAddress(this);
        }
    }

    public void addPerson(Person person){
        if(!personList.contains(person)) {
            personList.add(person);
            person.setAddress(this);
        }
    }

    public void getPersonList(){
        for(Person p : personList){
            System.out.println(p);
        }
    }


    private List<Department> getDepartmentList(){
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public static void getExtent(){
        for(Address a : extent){
            System.out.println(a);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
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
