package com.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.dao.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>
{

	public List<Student> findBystudentname(String studentname);

	

	//public Student findbyStudentname(String studentname);

}
