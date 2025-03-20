package com.java.SpringDataJPA.repository;

import com.java.SpringDataJPA.entity.Course;
import com.java.SpringDataJPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private  CourseRepository courseRepository;

    @Test
    public void savedCourseWithTeacher() {

        Teacher teacher= Teacher.builder()
                .firstName("Nazmul")
                .lastName("Mely")
                .build();

        Course course=Course
                .builder()
                .courseTitle("Golang")
                .teacher(teacher)
                .credit(7)
                .build();

        courseRepository.save(course);

    }

}