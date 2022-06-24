package com.student.studentmanagementsystem.controller;

import com.student.studentmanagementsystem.entity.Student;
import com.student.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/update/{id}")
    public String updateStudentForm(@PathVariable Long id , Model model)
    {
        model.addAttribute("student",studentService.getStudentById(id));
        return "update_student";
    }

    @PostMapping("/updateStudent/{id}")
    public String updateStudent(@PathVariable Long id ,@ModelAttribute Student student,Model model)
    {
        // getting student in db
        Student studentInDb = studentService.getStudentById(id);
        studentInDb.setId(id);
        studentInDb.setFirstName(student.getFirstName());
        studentInDb.setLastName(student.getLastName());
        studentInDb.setEmail(student.getEmail());
        studentService.updateStudent(studentInDb);
        return "redirect:/students/ListStudents";
    }
}
