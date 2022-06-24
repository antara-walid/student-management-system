package com.student.studentmanagementsystem;

import com.student.studentmanagementsystem.entity.Student;
import com.student.studentmanagementsystem.repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);

    }


    @Bean
    public CommandLineRunner dataLoader(StudentRepo repo) {
        return args -> {
//            repo.deleteAll();
//            repo.save(new Student("walid", "antara", "walid@walid.com"));
//            repo.save(new Student("bora", "bora", "bora@bora.com"));
//            repo.save(new Student("hamza", "bamoh", "bamoh@hamza.com"));

        };

    }
}
