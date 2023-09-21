package com.arthurgt.electronicgradeapp.service;

import com.arthurgt.electronicgradeapp.dao.StudentDAO;
import com.arthurgt.electronicgradeapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentDAO studentDAO;

    @Autowired
    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public List<Student> getAllStudents() {
        return studentDAO.findAllStudents();
    }

    public Student getStudentById(int studentId) {
        return studentDAO.findById(studentId);
    }

}
