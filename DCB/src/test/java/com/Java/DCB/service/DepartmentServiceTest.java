package com.Java.DCB.service;

import com.Java.DCB.entity.Department;
import com.Java.DCB.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DepartmentServiceTest {

    private final DepartmentService departmentService;

    @MockitoBean
    private DepartmentRepository departmentRepository;


    @Autowired
    public DepartmentServiceTest(DepartmentService departmentService) {
        this.departmentService = departmentService;

    }

    @BeforeEach
    void setUp() {

        Department department = Department
                .builder().departmentName("CSE")
                .departmentAddress("Chittagong")
                .departmentCode("CSE")
                .departmentId(1L)
                .build();

        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("CSE")).thenReturn(department);
    }

    @Test
    @DisplayName("Get Data based on valid department name ")
    public void whenValidDepartmentNameThenDepartmentShouldFound()
    {
        String departmentName = "CSE";
        Department found=departmentService.getDepartmentByName(departmentName);

        assertEquals(departmentName,found.getDepartmentName());
    }
}