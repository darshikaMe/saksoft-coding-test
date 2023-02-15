package com.saksoft.saksoftcodingtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.saksoft.saksoftcodingtest.model.Employee;
import com.saksoft.saksoftcodingtest.service.EmployeeService;

@RestController
@RequestMapping(value = "/api/v1/employee")
public class EmployeeController {
    
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }
    
}
