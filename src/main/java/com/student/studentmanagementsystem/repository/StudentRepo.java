package com.student.studentmanagementsystem.repository;

import com.student.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// because we extend JpaRepository we don't need to add @Repository because
// it is added in JpaRepository implementation
// the same goes for @Transactional
public interface StudentRepo extends JpaRepository<Student,Long> {
}
