package com.example.demo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity(name = "InsurancePolicy")
public class InsurancePolicy {
    LocalDate dateOfConclusion;
    LocalDate endDate;
    int value;
    @ManyToOne
    Car car;
    private Long id;

    public InsurancePolicy(LocalDate dateOfConclusion, LocalDate endDate, int value, Car car) {
        this.dateOfConclusion = dateOfConclusion;
        this.endDate = endDate;
        this.value = value;
        setCar(car);
    }

    public InsurancePolicy() {}

    public LocalDate getDateOfConclusion() {
        return dateOfConclusion;
    }

    public void setDateOfConclusion(LocalDate dateOfConclusion) {
        this.dateOfConclusion = dateOfConclusion;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(this.car != car) {
            this.car = car;

            car.addInsurancePolicy(this);
        }
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "dateOfConclusion=" + dateOfConclusion +
                ", endDate=" + endDate +
                ", value=" + value +
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
