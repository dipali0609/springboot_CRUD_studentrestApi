package com.edu.service;

import java.util.List;

import com.edu.dao.Student;

public interface StudentService 
{

	public Student saveStudent(Student student);

	public Student getStudentById(Integer studentid);

	public Student updateStudentById(Integer studentid, Student student);

	public void deleteStudentById(Integer studentid);

	public List<Student> findAllStudent();

	public List<Student> findBystudentname(String studentname);


	//public Student findbyStudentname(String studentname);

}
