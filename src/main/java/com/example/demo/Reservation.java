package com.example.demo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.lang.ref.Cleaner;
import java.time.LocalDate;

@Entity(name = "Reservation")
public class Reservation {
    LocalDate reservationDate;
    LocalDate startDate;
    LocalDate endDate;
    @Enumerated(EnumType.ORDINAL)
    Status status;
    int cost;
    //@ManyToOne
    //Client client;

    @ManyToOne
    Driver driver;
    @ManyToOne
    Receptionist receptionist;
    @ManyToOne
    Car car;
    @ManyToOne
    Address address;
    private Long id;

    public Reservation(){}

    public Reservation(LocalDate reservationDate, LocalDate startDate, LocalDate endDate, Status status, int cost) {
        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.cost = cost;
    }

    public Reservation(LocalDate reservationDate, LocalDate startDate, LocalDate endDate, Status status, int cost, Client client) {
        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.cost = cost;
        //setClient(client);
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    /*public Client getClient() {
        return client;
    }*/

    /*public void setClient(Client client) {
        if(this.client != client) {
            this.client = client;

            client.addReservation(this);
        }
    }*/

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        if(this.driver != driver){
            this.driver = driver;

            driver.addReservation(this);
        }
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        if(this.receptionist != receptionist) {
            this.receptionist = receptionist;

            receptionist.addReservation(this);
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(this.car != car) {
            this.car = car;

            car.addReservation(this);
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if(this.address != address) {
            this.address = address;
            address.addReservation(this);
        }
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationDate=" + reservationDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                ", cost=" + cost +
                //", client=" + client + "\n" +
                ", driver=" + driver + "\n" +
                ", receptionist=" + receptionist + "\n" +
                ", car=" + car + "\n" +
                ", address=" + address +
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
