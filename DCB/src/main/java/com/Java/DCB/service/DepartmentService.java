package com.Java.DCB.service;

import com.Java.DCB.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface DepartmentService {
   public Department saveDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department getDepartmentById(Long id);

    public void deleteDepartmentById(Long id);

    public Department updateDepartment(Long id, Department department);

    public Department getDepartmentByName(String departmentName);
}
