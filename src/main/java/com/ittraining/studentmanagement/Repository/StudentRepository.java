package com.ittraining.studentmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ittraining.studentmanagement.entities.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{
	
}