package com.Java.DCB.controller;


import com.Java.DCB.entity.Department;
import com.Java.DCB.error.DepartmentNotFoundException;
import com.Java.DCB.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    private final Logger logger= LoggerFactory.getLogger(DepartmentController.class);

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public Department save (@Valid @RequestBody Department department) {

        logger.info("department save called");
        return departmentService.saveDepartment(department);
    }


    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        logger.info("getAllDepartments called");
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id) throws DepartmentNotFoundException {

        return departmentService.getDepartmentById(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById (@PathVariable("id") Long id) {
        departmentService.deleteDepartmentById(id);

        return "Department deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment (@PathVariable("id") Long id, @RequestBody Department department) {
        return departmentService.updateDepartment(id,department);
    }


    @GetMapping("/departments/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName) {
        return departmentService.getDepartmentByName(departmentName);
    }
}
