package com.batch2.artifact1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch2.artifact1.domain.Student;
import com.batch2.artifact1.repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
    private CourseRepo rep;

    public List<Student> listAll() {
        return rep.findAll();
    }

    public void save(Student student) {
        rep.save(student);
    }

    public Student get(long id) {
        return rep.findById(id).orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }

    public void delete(long id) {
        if (!rep.existsById(id)) {
            throw new RuntimeException("Cannot delete, student not found with ID: " + id);
        }
        rep.deleteById(id);
    }
}