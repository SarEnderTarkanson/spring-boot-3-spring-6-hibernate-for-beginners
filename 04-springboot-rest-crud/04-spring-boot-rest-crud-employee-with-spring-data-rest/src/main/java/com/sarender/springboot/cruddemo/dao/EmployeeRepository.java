package com.sarender.springboot.cruddemo.dao;

import com.sarender.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
