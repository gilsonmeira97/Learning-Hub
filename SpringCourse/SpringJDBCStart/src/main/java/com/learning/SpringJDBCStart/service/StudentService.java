package com.learning.SpringJDBCStart.service;

import com.learning.SpringJDBCStart.model.Student;
import com.learning.SpringJDBCStart.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepo;

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }
}
