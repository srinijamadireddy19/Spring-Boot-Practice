package com.example.RestAPIDemo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.example.RestAPIDemo.Service.EmployeesService;
import com.example.RestAPIDemo.dto.EmployeesDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping("/api/employees")
public class EmployeesController{

    @Autowired
    private EmployeesService employeesService;

    @GetMapping
    public ResponseEntity<List<EmployeesDTO>> getAllEmployees() {
        List<EmployeesDTO> emps = employeesService.getAllEmployees();
        if (emps != null) {
            return ResponseEntity.ok(emps);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public String createEmployee(@RequestBody EmployeesDTO employeesDTO) {
        employeesService.createEmployee(employeesDTO);
        return "Employee created successfully"+employeesDTO.getId()+" "+employeesDTO.getName();

    }
}