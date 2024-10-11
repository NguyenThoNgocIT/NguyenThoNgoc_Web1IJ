package com.example.Lab6NTN.service;

import com.example.Lab6NTN.models.Students;
import com.example.Lab6NTN.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Students> ShowList() {
        return studentRepository.findAll();
    }

    public Students findById(Long id) throws Exception {
        Students student = studentRepository.findById(id);
        if (student == null) {
            throw new Exception(" Student not found");
        }
    return student;
    }

    public Students save(Students student) {
        return studentRepository.save(student);
    }

    public void delete(Long id) {
        StudentRepository.deleteById(id);
    }
}