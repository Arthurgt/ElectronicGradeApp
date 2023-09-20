package com.arthurgt.electronicgradeapp.dao;

import com.arthurgt.electronicgradeapp.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAllStudents();
    List<Student> findByLastName(String lastName);
    Student update(Student student);
    void remove(Integer id);
}
