package com.copart.JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.copart.JPA.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
