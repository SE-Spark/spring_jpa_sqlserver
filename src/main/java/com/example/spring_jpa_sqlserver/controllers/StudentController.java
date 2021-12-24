package com.example.spring_jpa_sqlserver.controllers;

import com.example.demo.models.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {
    public  final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService=studentService;
    }

    @GetMapping
    public List<Student> GetStudents(){
        return studentService.getStudents();
    }
}
