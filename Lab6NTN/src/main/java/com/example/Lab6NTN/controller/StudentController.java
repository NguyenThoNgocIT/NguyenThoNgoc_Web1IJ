package com.example.Lab6NTN.controller;

import com.example.Lab6NTN.models.Students;
import com.example.Lab6NTN.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    //khởi tạo danh sách
    public StudentController(){

    }
    @GetMapping("/")
    public List<Students> getStudentsList() {
        List<Students> list = studentService.ShowList();
        return list;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Students> getStudentById(@PathVariable("id") Long studentId) throws Exception {
        Students student = studentService.findById(studentId);
        return ResponseEntity.ok(student);
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<List<Students>> removeStudentById(@PathVariable("id") Long studentId) throws Exception {
       Students student= studentService.findById(studentId);
       if (student != null) {
           studentService.delete(studentId);
       }
    return ResponseEntity.status(404).body(studentService.ShowList());
    }

    }

