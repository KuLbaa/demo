package com.example.demo.Respository;

import com.example.demo.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRespository extends JpaRepository<Client,Integer> {
}
