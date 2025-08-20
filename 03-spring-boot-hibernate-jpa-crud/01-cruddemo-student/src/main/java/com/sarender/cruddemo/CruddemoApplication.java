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
            //createStudent(studentDao);
            createMultipleStudents(studentDao);
        };
    }

    private void createMultipleStudents(StudentDao studentDao) {
        System.out.println("Creating 3 student objects...");
        Student tempStudent1 = new Student("Jane", "Doe", "atarkan2@hotmail.com");
        Student tempStudent2 = new Student("Endo", "Doe", "atarkan3@hotmail.com");
        Student tempStudent3 = new Student("Beyza", "Doe", "atarkan4@hotmail.com");

        System.out.println("Saving the students...");
        studentDao.save(tempStudent1);
        studentDao.save(tempStudent2);
        studentDao.save(tempStudent3);
    }

    private void createStudent(StudentDao studentDao) {

        System.out.println("Creating new student object...");
        Student tempStudent = new Student("John", "Doe", "atarkan@hotmail.com");

        System.out.println("Saving the student...");
        studentDao.save(tempStudent);

        System.out.println("Saved student. Generated id: " + tempStudent.getId());


    }
}
