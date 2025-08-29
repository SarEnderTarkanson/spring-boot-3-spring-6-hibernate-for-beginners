package com.sarendertarkanson.demo.rest;

import com.sarendertarkanson.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Endo", "Tarkanson"));
        theStudents.add(new Student("Beyza", "Tarkanson"));
        theStudents.add(new Student("Makbule", "Tarkanson"));

        return theStudents;
    }

}
