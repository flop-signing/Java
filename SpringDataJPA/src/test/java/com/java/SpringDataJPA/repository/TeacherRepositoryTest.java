package com.java.SpringDataJPA.repository;

import com.java.SpringDataJPA.entity.Course;
import com.java.SpringDataJPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepositoryTest {


    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher() {

        Course course= Course
                .builder()
                .courseTitle("Spring Data JPA")
                .build();

        Course course1= Course
                .builder()
                .courseTitle("Spring Hibernate")
                .build();


        Teacher teacher=Teacher.builder()
                .firstName("John")
                .lastName("Doe")
                //.courseList(List.of(course,course1))
                        .build();



        teacherRepository.save(teacher);
    }


}