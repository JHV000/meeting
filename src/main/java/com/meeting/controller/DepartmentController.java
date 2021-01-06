package com.meeting.controller;


import com.meeting.model.Department;
import com.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/departments")
    public @ResponseBody
    List<Department> departments() {

        return departmentService.getAllDeps();
    }

    @RequestMapping("/adddepartment")
    public @ResponseBody
    Integer adddepartment(String departmentname) {
        return departmentService.adddepartment(departmentname);
    }

    @RequestMapping("/deletedep")
    public @ResponseBody
    Integer deletedep(Integer departmentid) {
        return departmentService.deletedep(departmentid);
    }

    @RequestMapping("/updatedep")

    public @ResponseBody
    String updatedep(Integer id, String name) {
        Integer result = departmentService.updatedep(id, name);
        if (result == 1) {
            return "success";
        }
        return "error";
    }

}
