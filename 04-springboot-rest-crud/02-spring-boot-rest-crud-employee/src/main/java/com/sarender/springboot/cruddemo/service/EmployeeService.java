package com.sarender.springboot.cruddemo.service;

import com.sarender.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
