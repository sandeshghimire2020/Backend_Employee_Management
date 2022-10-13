package com.project1.Employeemanagement.controller;

import com.project1.Employeemanagement.model.Employee;
import com.project1.Employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    //Add employee rest api

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){

        return employeeRepository.save(employee);
    }

}
