package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.Student;
import com.edu.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
	private StudentRepository studentRepository;
    
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	@Override
	public Student getStudentById(Integer studentid) {
		// TODO Auto-generated method stub
		{
		return studentRepository.findById(studentid).get();
		}
	}

	@Override
	public Student updateStudentById(Integer studentid, Student student) {
		// TODO Auto-generated method stub
		Student s=studentRepository.findById(studentid).get();
		if(s!=null)
		{
		      s.setStudentname(student.getStudentname());
		      s.setStudentfees(student.getStudentfees());
		      return studentRepository.save(s);
		}
		return s;
	}

	@Override
	public void deleteStudentById(Integer studentid) {
		 
		studentRepository.deleteById(studentid);
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
//
//	@Override
//	public Student findbyStudentname(String studentname) {
//		// TODO Auto-generated method stub
//		return studentRepository.findbyStudentname(studentname);
//	}

	@Override
	public List<Student> findBystudentname(String studentname) {
		// TODO Auto-generated method stub
		return studentRepository.findBystudentname(studentname);
	}

	
	

}
