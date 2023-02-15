package com.saksoft.saksoftcodingtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saksoft.saksoftcodingtest.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
    List <Employee> findAll();
}
