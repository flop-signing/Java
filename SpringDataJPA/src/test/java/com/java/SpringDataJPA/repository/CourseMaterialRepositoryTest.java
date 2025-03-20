package com.java.SpringDataJPA.repository;

import com.java.SpringDataJPA.entity.Course;
import com.java.SpringDataJPA.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;


    @Test
    public void saveCourseMaterial() {

        Course course=
                Course.builder()
                        .courseTitle("C#")
                        .credit(5)
                        .build();

        CourseMaterial courseMaterial=CourseMaterial
                .builder()
                .url("https://www.leetcode.com")
                .course(course)
                .build();
        courseMaterialRepository.save(courseMaterial);
    }


    @Test
    public void printAllCourseMaterials()
    {
        List<CourseMaterial> courseMaterials=courseMaterialRepository.findAll();
        System.out.println(courseMaterials);
    }


}