package com.learning.springsecdemo.controller;

import com.learning.springsecdemo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Kiran", "Java"),
            new Student(2, "Navin", "JS")
    ));

    @GetMapping("token")
    CsrfToken getCsrfToke(HttpServletRequest req) {
        return (CsrfToken) req.getAttribute("_csrf");
    }

    @GetMapping("students")
    List<Student> getAllStudents() {
        return this.students;
    }

    @PostMapping("student")
    Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

}
