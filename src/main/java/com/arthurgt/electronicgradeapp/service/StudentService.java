package com.arthurgt.electronicgradeapp.service;

import com.arthurgt.electronicgradeapp.entity.Student;
import com.arthurgt.electronicgradeapp.error.StudentNotFoundException;
import com.arthurgt.electronicgradeapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int studentId) {
        if(studentId < 0 ) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        Optional<Student> result = studentRepository.findById(studentId);
        Student theStudent = null;
        if(result.isPresent()) {
            theStudent = result.get();
            return theStudent;
        }
        else {
            throw new RuntimeException("Did not find student id - " + studentId);
        }
    }

}
