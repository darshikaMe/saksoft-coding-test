package com.saksoft.saksoftcodingtest.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee implements Serializable{


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;


    @Column(name = "first_name", nullable = false, length = 4000)
    private String firstName;


    @Column(name = "last_name", nullable = false, length = 4000)
    private String lastName;


    @Column(name = "email", nullable = false, length = 4000)
    private String email;


    @Column(name = "age")
    private Long age;

}