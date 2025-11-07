package com.example.studentapp.controller;

import com.example.studentapp.model.Student;
import com.example.studentapp.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")  // base URL for all APIs in this controller
public class StudentController {

    private final StudentService service;

    // constructor-based dependency injection
    public StudentController(StudentService service) {
        this.service = service;
    }

    // CREATE: add a new student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    // READ: get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // READ: get student by ID
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable String id) {
        return service.getStudentById(id);
    }

    // UPDATE: update a student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    // DELETE: delete student by ID
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        service.deleteStudent(id);
    }
}
