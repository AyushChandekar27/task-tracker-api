package com.example.studentapp.repository;
import com.example.studentapp.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


// <Student, String> → (entity class, ID type)
public interface StudentRepository extends MongoRepository<Student, String> {

}
