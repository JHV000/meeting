package com.meeting.controller;


import com.meeting.model.Department;
import com.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/departments")
    public List<Department> departments(Model model) {
        model.addAttribute("deps");
        return departmentService.getAllDeps();
    }
    @RequestMapping("/adddepartment")
    public Integer adddepartment(String departmentname) {
        return departmentService.adddepartment(departmentname);
    }
    @RequestMapping("/deletedep")
    public Integer deletedep(Integer departmentid) {
        return departmentService.deletedep(departmentid);
    }
    @RequestMapping("/updatedep")
    @ResponseBody
    public String updatedep(Integer id, String name) {
        Integer result = departmentService.updatedep(id, name);
        if (result == 1) {
            return "success";
        }
        return "error";
    }

}
