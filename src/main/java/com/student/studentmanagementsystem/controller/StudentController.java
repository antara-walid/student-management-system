package com.student.studentmanagementsystem.controller;

import com.student.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("ListStudents")
    public String listAllStudents(Model model)
    {
        model.addAttribute("listStudents" ,studentService.getAllStudents());
        return "students";
    }
}
