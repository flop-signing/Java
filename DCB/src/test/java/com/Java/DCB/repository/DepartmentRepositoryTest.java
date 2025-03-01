package com.Java.DCB.repository;

import com.Java.DCB.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    private final DepartmentRepository departmentRepository;
    private final TestEntityManager entityManager;

    public DepartmentRepositoryTest( DepartmentRepository departmentRepository,TestEntityManager entityManager ) {
        this.departmentRepository = departmentRepository;
        this.entityManager = entityManager;
    }

    @BeforeEach
    void setUp() {

        Department department=Department.builder()
                .departmentName("ME")
                .departmentCode("ME-03")
                .departmentAddress("Pahartali")
                .build();


        entityManager.persist(department);
    }

    @Test
    public void whenFindByIdThenReturnDepartment()
    {
        Department department=departmentRepository.findById(1L).get();

        assertEquals(department.getDepartmentName(), "ME");
    }
}