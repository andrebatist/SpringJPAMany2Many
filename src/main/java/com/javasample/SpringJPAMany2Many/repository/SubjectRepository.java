package com.javasample.SpringJPAMany2Many.repository;

import com.javasample.SpringJPAMany2Many.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
