package com.arthurgt.electronicgradeapp.dao;

import com.arthurgt.electronicgradeapp.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);
        query.setParameter("theData", lastName);
        return query.getResultList();
    }

    @Override
    public List<Student> findAllStudents() {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student", Student.class);
        return query.getResultList();
    }

    @Transactional
    @Override
    public Student update(Student student) {
        return entityManager.merge(student);
    }

    @Transactional
    @Override
    public void remove(Integer id) {
        Student student = findById(id);
        if(Objects.nonNull(student)) entityManager.remove(student);
    }
}
