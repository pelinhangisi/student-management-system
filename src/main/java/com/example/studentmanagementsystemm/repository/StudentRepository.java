package com.example.studentmanagementsystemm.repository;

import com.example.studentmanagementsystemm.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student, Long> {
}
