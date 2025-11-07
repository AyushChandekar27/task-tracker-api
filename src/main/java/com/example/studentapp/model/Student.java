package com.example.studentapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;





@Document(collection = "students")   // tells Spring this class maps to MongoDB collection
public class Student{

    @Id    // this field will be the MongoDB document ID
    private String id;

    @NotBlank(message = "Name Cannot be empty")
    private String name;

    @Min(value=1, message ="Age must be at least 1 ")
    private int age;

    // ✅ Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ✅ Default constructor (MongoDB needs this)
    public Student() {}

    // ✅ Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
