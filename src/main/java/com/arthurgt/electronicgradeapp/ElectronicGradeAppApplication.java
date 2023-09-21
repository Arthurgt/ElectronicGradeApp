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

}
