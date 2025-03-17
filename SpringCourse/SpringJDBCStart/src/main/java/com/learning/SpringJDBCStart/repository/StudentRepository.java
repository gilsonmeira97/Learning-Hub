package com.learning.SpringJDBCStart.repository;

import com.learning.SpringJDBCStart.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbc;

    public void save(Student student) {
        String sql = "insert into student (rollno, name, marks) values (?,?,?)";
        int result = jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks());
        System.out.printf("%d lines affected.", result);
    }

    public List<Student> findAll() {
        String sql = "select * from student";
        return jdbc.query(sql, (rs, rowValue) -> {
            Student newStudent = new Student();
            newStudent.setRollNo(rs.getInt("rollno"));
            newStudent.setName(rs.getString("name"));
            newStudent.setMarks(rs.getInt("marks"));
            return newStudent;
        });

    }
}
