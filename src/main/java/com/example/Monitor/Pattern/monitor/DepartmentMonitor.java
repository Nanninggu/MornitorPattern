package com.example.Monitor.Pattern.monitor;

import com.example.Monitor.Pattern.dto.Department;
import com.example.Monitor.Pattern.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMonitor {

    private final DepartmentMapper departmentMapper;

    @Autowired
    public DepartmentMonitor(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    public synchronized void updateDepartment(Department department) {
        departmentMapper.update(department);
    }

    public synchronized Department getDepartment(int id) {
        return departmentMapper.get(id);
    }
}