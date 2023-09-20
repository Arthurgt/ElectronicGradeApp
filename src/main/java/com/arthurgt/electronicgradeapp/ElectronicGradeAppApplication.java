package com.arthurgt.electronicgradeapp;

import com.arthurgt.electronicgradeapp.dao.StudentDAO;
import com.arthurgt.electronicgradeapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ElectronicGradeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectronicGradeAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);
//			findStudentById(studentDAO);
//			findAllStudents(studentDAO);
//			findByLastName(studentDAO,"Nowak");
//			updateStudent(studentDAO);
			removeStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating the student");
		Student student = new Student("Tomasz", "Kowalski", "tomek@gmail.com");

		System.out.println("Saving the student");
		studentDAO.save(student);

		System.out.println("Get student id");
		System.out.println(student.getId());
	}

	private void findStudentById(StudentDAO studentDAO) {
		System.out.println("Finding student");
		Student student = studentDAO.findById(1);

		System.out.println("Found the student");
		System.out.println(student.toString());
	}

	private void findAllStudents(StudentDAO studentDAO) {
		System.out.println("Finding all students");
		List<Student> studentList = studentDAO.findAllStudents();

		System.out.println("Found all students");
		System.out.println(studentList.toString());
	}

	private void findByLastName(StudentDAO studentDAO, String lastName) {
		System.out.println("Finding student with last name: " + lastName);
		List<Student> studentList = studentDAO.findByLastName(lastName);

		System.out.println("Found all students with last name " + lastName);
		System.out.println(studentList.toString());
	}

	private void updateStudent(StudentDAO studentDAO) {
		System.out.println("Updating student");
		Student student = studentDAO.findById(1);
		student.setLastName("Lolek");
		student = studentDAO.update(student);
		System.out.println("Updated " + student.toString());
	}

	private void removeStudent(StudentDAO studentDAO) {
		System.out.println("Removing student");

		studentDAO.remove(1);
		System.out.println("Removed student");
	}
}
