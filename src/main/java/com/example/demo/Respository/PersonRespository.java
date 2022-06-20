package com.example.demo.Respository;

import com.example.demo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRespository extends JpaRepository<Person,Integer> {

}
