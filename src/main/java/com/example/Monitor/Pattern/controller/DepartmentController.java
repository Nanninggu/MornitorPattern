package com.example.Monitor.Pattern.controller;

import com.example.Monitor.Pattern.dto.Department;
import com.example.Monitor.Pattern.monitor.DepartmentMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentMonitor departmentMonitor;

    @Autowired
    public DepartmentController(DepartmentMonitor departmentMonitor) {
        this.departmentMonitor = departmentMonitor;
    }

    @PutMapping
    public ResponseEntity<Void> updateDepartment(@RequestBody Department department) {
        departmentMonitor.updateDepartment(department);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable int id) {
        Department department = departmentMonitor.getDepartment(id);
        return ResponseEntity.ok(department);
    }
}
