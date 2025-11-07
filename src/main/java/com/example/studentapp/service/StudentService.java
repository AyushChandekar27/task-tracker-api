package com.example.studentapp.service;

import com.example.studentapp.model.Student;
import com.example.studentapp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // CREATE student
    public Student addStudent(Student student) {
        return repository.save(student);
    }

    // READ all students
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // READ one student
    public Optional<Student> getStudentById(String id) {
        return repository.findById(id);
    }

    // UPDATE student
    public Student updateStudent(String id, Student updatedStudent) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setName(updatedStudent.getName());
                    existing.setAge(updatedStudent.getAge());
                    return repository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    // DELETE student
    public void deleteStudent(String id) {
        repository.deleteById(id);
    }
}
