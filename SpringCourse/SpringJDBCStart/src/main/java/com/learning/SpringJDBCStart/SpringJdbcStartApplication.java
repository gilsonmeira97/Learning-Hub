package com.learning.SpringJDBCStart;

import com.learning.SpringJDBCStart.model.Student;
import com.learning.SpringJDBCStart.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcStartApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcStartApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Navin");
		s.setMarks(78);

		StudentService studentServie = context.getBean(StudentService.class);

		studentServie.addStudent(s);

		List<Student> students = studentServie.getStudents();
		System.out.println(students);
	}
}
