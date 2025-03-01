package com.Java.DCB.controller;

import com.Java.DCB.entity.Department;
import com.Java.DCB.error.DepartmentNotFoundException;
import com.Java.DCB.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    private MockMvc mockMvc;
    private DepartmentService departmentService;
    Department department;

    public DepartmentControllerTest(MockMvc mockMvc, DepartmentService departmentService) {
        this.mockMvc = mockMvc;
        this.departmentService = departmentService;
    }



    @BeforeEach
    void setUp() {

        department=Department.builder()
                .departmentName("ME")
                .departmentAddress("Sylhet")
                .departmentCode("ME-09")
                .departmentId(1L)
                .build();
    }

    @Test
    void save() throws Exception {
       Department inputDepartment=Department.builder()
                .departmentName("ME")
                .departmentAddress("Sylhet")
                .departmentCode("ME-09")
                .build();

        Mockito.when(departmentService.saveDepartment(inputDepartment)).thenReturn(department);

        mockMvc.perform(MockMvcRequestBuilders.post("/departments")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "    \"departmentName\": \"Computer Science\",\n" +
                        "    \"departmentAddress\": \"Building A, University Campus\",\n" +
                        "    \"departmentCode\": \"CS101\"\n" +
                        "  }"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void getDepartmentById() throws Exception {

        Mockito.when(departmentService.getDepartmentById(1L)).thenReturn(department);
        mockMvc.perform(get("/departments/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect((ResultMatcher) jsonPath("$.departmentName").value(department.getDepartmentName()));
    }
}