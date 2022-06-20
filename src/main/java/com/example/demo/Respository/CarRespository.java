package com.example.demo.Respository;

import com.example.demo.Car;
import com.example.demo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRespository extends JpaRepository<Car,Integer> {
}
