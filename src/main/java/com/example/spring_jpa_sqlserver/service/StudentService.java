package com.example.spring_jpa_sqlserver.service;

import com.example.demo.intefaces.StudentRepo;
import com.example.demo.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo=studentRepo;
    }

    public List<Student> getStudents()
    {
        return  studentRepo.findAll();
    }
    public List<Student> getAllStudents()
    {
        return  List.of(
                new Student(
                        1L,
                        "Mirriam joy",
                        "miriam@gmail.com",
                        LocalDate.of(2000, Month.APRIL,13),
                        21
                )
        );
    }
}
