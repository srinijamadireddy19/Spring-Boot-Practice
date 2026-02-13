package com.example.RestAPIDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RestAPIDemo.entity.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    
}
