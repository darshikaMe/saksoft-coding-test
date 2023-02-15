package com.saksoft.saksoftcodingtest.service;

import java.util.List;

import com.saksoft.saksoftcodingtest.model.Employee;
import com.saksoft.saksoftcodingtest.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
}
