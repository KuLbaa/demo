package com.example.demo.Respository;
import com.example.demo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee,Integer> {
}
