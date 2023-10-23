package com.arthurgt.electronicgradeapp.repository;

import com.arthurgt.electronicgradeapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {}
