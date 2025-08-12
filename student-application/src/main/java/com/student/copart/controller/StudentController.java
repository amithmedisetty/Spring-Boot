package com.student.copart.controller;

import com.student.copart.model.Student;
import com.student.copart.repository.StudentRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentRepository student;
    @GetMapping("/getAll")
    @ResponseBody
    public ArrayList<Student> getAll(){
        return student.findAll();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable int id){
        return student.findById(id);
    }

    @PostMapping
    public void add(@RequestBody Student s){
        student.save(s);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        if(student.delete(id)){
            return ResponseEntity.status(HttpStatus.OK).body("student with ID "+ id +" deleted successfully");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with ID "+ id +" is not foound");
        }
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Student s){
        student.update(s);
    }
}
