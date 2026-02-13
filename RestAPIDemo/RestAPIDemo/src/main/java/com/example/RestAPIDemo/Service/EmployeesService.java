package com.example.RestAPIDemo.Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.stream.Collectors;
import com.example.RestAPIDemo.entity.Employees;
import com.example.RestAPIDemo.dto.EmployeesDTO;
import com.example.RestAPIDemo.repository.EmployeesRepository;

@Service
public class EmployeesService {

    @Autowired
    private EmployeesRepository employeesRepository;

    private EmployeesDTO convertToDTO(Employees employees) {
        return new EmployeesDTO(employees.getId(),
        employees.getName(),
        employees.getPhno(),
        employees.getDept());   
    }

    private Employees convertToEntity(EmployeesDTO employeesDTO) {
        return new Employees(
            employeesDTO.getId(),
            employeesDTO.getName(),
            employeesDTO.getPhno(),
            employeesDTO.getDept()
        );
    }

    public List<EmployeesDTO> getAllEmployees() {
        return employeesRepository.findAll().stream()
        .map(this::convertToDTO)
        .collect(Collectors.toList());
    }

    public EmployeesDTO createEmployee(EmployeesDTO employeesDTO) {
        Employees employees = convertToEntity(employeesDTO);
        Employees savedEmp = employeesRepository.save(employees);
        return convertToDTO(savedEmp);
    }


}
