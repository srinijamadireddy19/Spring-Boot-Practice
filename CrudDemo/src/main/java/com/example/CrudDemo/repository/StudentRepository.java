package com.example.CrudDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CrudDemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}