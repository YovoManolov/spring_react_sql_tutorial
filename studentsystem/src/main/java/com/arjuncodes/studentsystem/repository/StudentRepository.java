package com.arjuncodes.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arjuncodes.studentsystem.model.Student;

public interface StudentRepository extends  JpaRepository<Student, Integer>{

	
		
}
