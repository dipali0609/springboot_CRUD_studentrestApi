package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.dao.Student;
import com.edu.service.StudentService;

@RestController
public class StudentController 
{

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
		
	}
	
	@GetMapping("/getStudentById/{sid}")
	public Student getStudentById(@PathVariable("sid") Integer studentid)
	{
		return studentService.getStudentById(studentid);
		
	}
	
	@PutMapping("/updateStudentById/{sid}")
	public Student updateStudentById(@PathVariable("sid") Integer studentid,@RequestBody Student student)
	{
		return studentService.updateStudentById(studentid,student);
		
	}
	
	@DeleteMapping("/deleteStudentById/{sid}")
	public String deleteStudentById(@PathVariable("sid") Integer studentid)
	{
		studentService.deleteStudentById(studentid);
		return "Student deleted";
		
	}
	
	@GetMapping("/findAllStudent")
	public List<Student> findAllStudent()
	{
		return studentService.findAllStudent();
		
	}
	
//	 @GetMapping("/findbyStudentname/{sname}")
//	   public Student findbyStudentname(@PathVariable("sname") String studentname){
//			return studentService.findbyStudentname(studentname);
//		}
	
	//By typing the method name we need to follow the naming convention like findbyemployeename
	@GetMapping("/findBystudentname/{sname}")
	public List<Student> findBystudentname(@PathVariable("sname") String studentname)
	{
		return studentService.findBystudentname(studentname);
		
	}

	
}
