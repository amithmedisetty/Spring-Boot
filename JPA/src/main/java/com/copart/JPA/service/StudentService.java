package com.copart.JPA.service;

import com.copart.JPA.model.Student;
import com.copart.JPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentrepo;

    public List<Student> findAll(){
        return studentrepo.findAll();
    }

    public Student findById(int id){
        return studentrepo.findById(id).orElse(null);   //which return an optional class so use orElse
    }

    public Student add(Student student) {
        return studentrepo.save(student);
    }
    public Student update(Student student) {
        return studentrepo.save(student);
    }
    public boolean delete(int id){
        if(studentrepo.existsById(id)){
            studentrepo.deleteById(id);
            return true;
        }
        return false;
    }
}
