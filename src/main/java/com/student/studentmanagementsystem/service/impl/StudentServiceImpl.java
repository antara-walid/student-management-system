package com.student.studentmanagementsystem.service.impl;

import com.student.studentmanagementsystem.entity.Student;
import com.student.studentmanagementsystem.repository.StudentRepo;
import com.student.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student savaStudent(Student student) {

        return studentRepo.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }
}
