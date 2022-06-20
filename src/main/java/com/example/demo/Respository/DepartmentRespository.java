package com.example.demo.Respository;
import com.example.demo.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRespository extends JpaRepository<Department,Integer> {
}
