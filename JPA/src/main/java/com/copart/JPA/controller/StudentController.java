package com.copart.JPA.controller;

import com.copart.JPA.model.Student;
import com.copart.JPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController{

    @Autowired
    private StudentService service;

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        Student student = service.findById(id);
        if (student == null) {
            return ResponseEntity.status(404).body("Student not found");
        }
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<Student> add(@RequestBody Student student) {
        return ResponseEntity.status(201).body(service.add(student));
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Student student) {
        return ResponseEntity.ok(service.update(student));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        if (service.delete(id)) {
            return ResponseEntity.ok("Student deleted");
        }
        return ResponseEntity.status(404).body("Student not found");
    }
}
