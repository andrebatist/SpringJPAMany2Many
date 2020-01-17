package com.javasample.SpringJPAMany2Many.repository;

import com.javasample.SpringJPAMany2Many.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
