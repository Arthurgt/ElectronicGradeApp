package com.arthurgt.electronicgradeapp;

import com.arthurgt.electronicgradeapp.dao.StudentDAO;
import com.arthurgt.electronicgradeapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElectronicGradeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectronicGradeAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);
			findStudentById(studentDAO);
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
}
