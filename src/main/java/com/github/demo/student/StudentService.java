package com.github.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(1, "Javed", "Akhtar", LocalDate.now(), "javed@gmail.com", 25),
                new Student(2, "Noor", "Shan", LocalDate.now(), "noor@gmail.com", 26),
                new Student(1, "Waseem", "Ali", LocalDate.now(), "monis@gmail.com", 27)
        );
    }

}
