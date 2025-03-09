package com.java.SpringDataJPA.repository;

import com.java.SpringDataJPA.entity.Guardian;
import com.java.SpringDataJPA.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {


    @Autowired
    private StudentRepository studentRepository;


    @Test
    public void savedStudent() {
        Student student = Student.builder()
                .email("mehedy@gmail.com")
                .firstName("Mehedi")
                .lastName("Hassan")
                //.gurdianName("Meherun")
               // .gurdianEmail("meheu@gmail.com")
                //.gurdianMobile("01706548525")
                .build();


        studentRepository.save(student);
    }

    // save student with guardian

    @Test
    public void saveStudentWithGuardianDetails(){

        Guardian guardian=Guardian.builder()
                .email("meherun234@gmail.com")
                .mobile("01706548524")
                .name("Meherun")
                .build();


        Student student=Student.builder()
                .firstName("Mehedi")
                .lastName("Hassan")
                .email("mehedy123@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void getAllStudents() {
        List<Student> students = studentRepository.findAll();
        System.out.println(students);
    }

}