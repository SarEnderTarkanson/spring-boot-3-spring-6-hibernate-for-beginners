package com.sarender.cruddemo.dao;

import com.sarender.cruddemo.entity.Student;

import java.util.List;

public interface StudentDao {

    void save (Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByFirstName(String theFirstName);

    void update(Student theStudent);

}
