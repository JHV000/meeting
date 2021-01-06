package com.meeting.service;


import com.meeting.model.Department;
import java.util.List;
public interface DepartmentService {
    Department getDepById(Integer id);
    List<Department> getAllDeps();
    Integer adddepartment(String departmentname);
    Integer deletedep(Integer departmentid);
    Integer updatedep(Integer id, String name);
}
