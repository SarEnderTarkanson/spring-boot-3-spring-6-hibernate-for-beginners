package com.sarender.springboot.cruddemo.dao;

import com.sarender.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
