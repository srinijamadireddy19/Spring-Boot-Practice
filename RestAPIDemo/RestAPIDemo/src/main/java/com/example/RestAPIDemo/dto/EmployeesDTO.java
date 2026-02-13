package com.example.RestAPIDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeesDTO {
    
    private Long id;
    private String name;
    private int phno;
    private String dept;
}