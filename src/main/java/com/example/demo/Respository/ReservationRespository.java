package com.example.demo.Respository;

import com.example.demo.Person;
import com.example.demo.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRespository extends JpaRepository<Reservation,Integer> {
}
