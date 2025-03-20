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
                .email("mehedy1804106@gmail.com")
                .firstName("Mehedi")
                .lastName("Hassan")
                //.gurdianName("Meherun")
               // .gurdianEmail("meheu@gmail.com")
                //.gurdianMobile("01706548525")
                .build();


        studentRepository.save(student);
    }


    // print all students

    @Test
    public void printAllStudents() {
        List<Student> students = studentRepository.findAll();
        System.out.println(students);
    }

    // save student with guardian

    @Test
    public void saveStudentWithGuardianDetails(){

        Guardian guardian=Guardian.builder()
                .email("mortoza234@gmail.com")
                .mobile("01718228835")
                .name("Mortoza234")
                .build();


        Student student=Student.builder()
                .firstName("Maruf")
                .lastName("Hossan")
                .email("maruf@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }
//
//    @Test
//    public void getAllStudents() {
//        List<Student> students = studentRepository.findAll();
//        System.out.println(students);
//    }



    @Test
    public void getStudentByFirstName() {
        List<Student> students = studentRepository.findByFirstName("Mehedi");

        System.out.println("Students" +students);
    }



    @Test
    public void getStudentByFirstNameContaining() {
        List<Student> students = studentRepository.findByFirstNameContaining("hed");

        System.out.println("Students" +students);
    }

    @Test
    public void printStudentBasedOnGuardianName() {
        List<Student> students = studentRepository.findByGuardianName("Mehedi");
        System.out.println("Students" +students);
    }

    @Test
    public void getStudentByEmailAddress() {
        Student student=studentRepository.getStudentByEmailAddress("mehedy12@gmail.com");

        System.out.println("Student "+student);
    }


    @Test
    public void getStudentFirstNameByEmailAddress(){

        String firstName=studentRepository.getStudentFirstNameByEmailAddress("mehedy12@gmail.com");

        System.out.println("First Name is: "+firstName );

    }


 @Test
    public void getStudentByEmailAddressNative()
    {
        Student student=studentRepository.getStudentByEmailAddressNative("mehedy18@gmail.com");

        System.out.println("Student "+student);
    }



    // Advanced Native through parameter

    @Test
    public void getStudentByEmailAddressNativeNamedParam()
    {
        Student student=studentRepository.getStudentByEmailAddressNativeNamedParam("mehedy12@gmail.com");

        System.out.println("Student "+student);
    }



/*  @Test
    public void updateStudentByEmailIdTest(){
        studentRepository.updateStudentNameByEmailId("Mehedi","mehedy1804106@gmail.com");
    }*/



}
