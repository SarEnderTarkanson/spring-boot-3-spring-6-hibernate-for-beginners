package com.sarender.cruddemo;

import com.sarender.cruddemo.dao.StudentDao;
import com.sarender.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDao studentDao) {
        return runner -> {
            createStudent(studentDao);
        };
    }

    private void createStudent(StudentDao studentDao) {

        System.out.println("Creating new student object...");
        Student tempStudent = new Student("John", "Doe", "atarkan@hotmail.com");

        System.out.println("Saving the student...");
        studentDao.save(tempStudent);

        System.out.println("Saved student. Generated id: " + tempStudent.getId());


    }
}
