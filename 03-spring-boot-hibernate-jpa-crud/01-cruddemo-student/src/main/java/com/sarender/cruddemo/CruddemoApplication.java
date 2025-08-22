package com.sarender.cruddemo;

import com.sarender.cruddemo.dao.StudentDao;
import com.sarender.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDao studentDao) {
        return runner -> {
            //createStudent(studentDao);
            //createMultipleStudents(studentDao);
            //readStudent(studentDao);
            //queryForStudents(studentDao);
            //queryForStudentsByFirstName(studentDao);
            updateStudent(studentDao);
        };
    }

    private void updateStudent(StudentDao studentDao) {
        int studentId = 5;
        System.out.println("Getting the student with id: " + studentId);
        Student myStudent = studentDao.findById(studentId);
        System.out.println("Updating the student...");
        myStudent.setFirstName("Makbule Busra");
        studentDao.update(myStudent);
        System.out.println("Updated student: " + myStudent);
    }

    private void queryForStudentsByFirstName(StudentDao studentDao) {
        List<Student> theStudents = studentDao.findByFirstName("Endo");
        for (Student tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }

    private void queryForStudents(StudentDao studentDao) {
        List<Student> theStudents = studentDao.findAll();
        for (Student tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }

    private void readStudent(StudentDao studentDao) {
        System.out.println("Creating the new student object");
        Student tempStudent = new Student("Makbule", "Doe", "makbule@gmail.com");
        System.out.println("Saving the student");
        studentDao.save(tempStudent);
        int theId = tempStudent.getId();
        System.out.println("Saved student. Generated id: " + theId);
        System.out.println("Retrieveing the student with id: " + theId);
        Student myStudent = studentDao.findById(theId);
        System.out.println("Found the student: " + myStudent);
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
