package com.java.SpringDataJPA.repository;

import com.java.SpringDataJPA.entity.Course;
import com.java.SpringDataJPA.entity.Student;
import com.java.SpringDataJPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.swing.border.TitledBorder;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private  CourseRepository courseRepository;

    @Test
    public void savedCourseWithTeacher() {

        Teacher teacher= Teacher.builder()
                .firstName("Bonjur")
                .lastName("Sely")
                .build();

        Course course=Course
                .builder()
                .courseTitle("PHP")
                .teacher(teacher)
                .credit(4)
                .build();

        courseRepository.save(course);

    }

    @Test
    public void findAllPagination()
    {

        Pageable firstPageWithThreeRecords= PageRequest.of(0, 3);

        Pageable secondPageWithTwoRecords= PageRequest.of(1, 2);


        List<Course> courses= courseRepository.findAll(firstPageWithThreeRecords).getContent();


        long totalElements=courseRepository.findAll(firstPageWithThreeRecords).getTotalElements();

        int totalPages=  courseRepository.findAll(firstPageWithThreeRecords).getTotalPages();

        System.out.println("Total Pages"+ totalPages);
        System.out.println("Total Elements"+ totalElements);
        System.out.println("The list of Courses"+courses);
    }


    @Test
    public void findAllSorting()
    {
        Pageable sortByTitle= PageRequest.of(0, 2, Sort.by("courseTitle"));


        Pageable sortByCreditDesc= PageRequest.of(0, 2, Sort.by("credit").descending());

        Pageable sortByTitleAndCreditDesc= PageRequest.of(0, 2, Sort.by("courseTitle").descending().and(Sort.by("credit")));


        List<Course> courses= courseRepository.findAll(sortByTitle).getContent();

        System.out.println("Courses"+courses);



    }

    @Test
    public void findByCourseTitle(){

        Pageable firstPageTenRecords= PageRequest.of(0, 10);
        List<Course> courses= courseRepository.findByCourseTitle("D",firstPageTenRecords).getContent();

        System.out.println("Courses"+courses);

    }

    @Test
    public void saveCourseWithStudentAndTeacher() {

        Teacher teacher=Teacher.builder()
                .firstName("Bob")
                .lastName("Sely")
                .build();
        Course course=Course
                .builder()
                .courseTitle("PHP")
                .teacher(teacher)
                .build();

        Student student=Student
                .builder()
                .firstName("Salam")
                .lastName("Jay")
                .email("salamjay@gmail.com")
                .build();

        course.addStudent(student);
        courseRepository.save(course);
    }

}