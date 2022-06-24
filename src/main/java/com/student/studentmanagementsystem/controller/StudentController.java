package com.student.studentmanagementsystem.controller;

import com.student.studentmanagementsystem.entity.Student;
import com.student.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/ListStudents")
    public String listAllStudents(Model model)
    {
        model.addAttribute("listStudents" ,studentService.getAllStudents());
        return "students";
    }
    @GetMapping("/addStudent")
    public String addStudentShow(Model model)
    {
        Student student = new Student();
        model.addAttribute("student",student);
        return "add_student";
    }

    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute("student") Student student)
    {
        studentService.savaStudent(student);
        return "redirect:/students/ListStudents";
    }
}
