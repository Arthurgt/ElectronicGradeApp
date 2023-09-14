package com.arthurgt.electronicgradeapp.dao;

import com.arthurgt.electronicgradeapp.entity.Student;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
}
