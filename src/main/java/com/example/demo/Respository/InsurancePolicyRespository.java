package com.example.demo.Respository;
import com.example.demo.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsurancePolicyRespository extends JpaRepository<InsurancePolicy,Integer> {
}
