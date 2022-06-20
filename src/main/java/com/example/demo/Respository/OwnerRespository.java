package com.example.demo.Respository;

import com.example.demo.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRespository extends JpaRepository<Owner, Integer> {
}
