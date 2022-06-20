package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity(name = "Manager")
public class Manager extends Employee{
    int bonus;
    @OneToOne
    Department department;

    public Manager(String name, String surname, String PESEL, String phoneNumber, Address address, LocalDate startDate, int salary, boolean companyCar, int bonus) {
        super(name, surname, PESEL, phoneNumber, address, startDate, salary, companyCar);
        this.bonus = bonus;
    }

    public Manager() {}

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @OneToOne
    public Department getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(Department department) {
        if(this.department != department) {
            this.department = department;

            department.setManager(this);
        }
    }

    public int getSalary(){
        return salary + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "startDate=" + startDate +
                ", salary=" + salary +
                ", companyCar=" + companyCar +
                ", department=" + department +
                ", bonus=" + bonus +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
