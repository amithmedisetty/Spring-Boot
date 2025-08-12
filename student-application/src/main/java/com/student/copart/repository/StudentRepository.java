package com.student.copart.repository;
import com.student.copart.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
@Repository
public class StudentRepository {
    private ArrayList<Student> list=new ArrayList<>();
    @PostConstruct
    public void init(){
        list.add(new Student(101,"amith","46",90));
        list.add(new Student(102,"surya","48",91));
    }

    public void save(Student s){
        list.add(s);
    }
    public ArrayList<Student> findAll(){
        return list;
    }
    public Student findById(int id){
        for(Student s:list){
            if(s.getId()==id)return s;
        }
        return null;
    }
    public boolean delete(int id){
        for(Student s:list){
            if(s.getId()==id){
                list.remove(s);
                return true;
            }
        }
        return false;
    }
    public void update(Student student){
        for(int i=0;i<list.size();i++){
            if(student.getId()==list.get(i).getId()){
                list.set(i,student);
            }
        }
    }
}
