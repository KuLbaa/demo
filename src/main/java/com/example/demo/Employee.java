package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity(name = "Employee")
public abstract class Employee extends Person {
    LocalDate startDate;
    int salary;
    boolean companyCar;
    @ManyToOne
    Department department;

    public Employee(String name, String surname, String PESEL, String phoneNumber, Address address, LocalDate startDate, int salary, boolean companyCar) {
        super(name, surname, PESEL, phoneNumber, address);
        this.startDate = startDate;
        this.salary = salary;
        this.companyCar = companyCar;
    }

    public Employee(){}

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isCompanyCar() {
        return companyCar;
    }

    public void setCompanyCar(boolean companyCar) {
        this.companyCar = companyCar;
    }

    @ManyToOne
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if(this.department != department) {
            this.department = department;

            department.addEmployee(this);
        }
    }
}
