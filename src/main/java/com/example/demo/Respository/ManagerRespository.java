package com.example.demo.Respository;

import com.example.demo.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRespository extends JpaRepository<Manager, Integer> {
}
