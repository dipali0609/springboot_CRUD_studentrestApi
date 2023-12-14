package com.edu.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table")

public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int studnetid;
private String studentname;
private float studentfees;


public Student() {
	super();
	// TODO Auto-generated constructor stub
}


public Student(int studnetid, String studentname, float studentfees) {
	super();
	this.studnetid = studnetid;
	this.studentname = studentname;
	this.studentfees = studentfees;
}


public int getStudnetid() {
	return studnetid;
}


public void setStudnetid(int studnetid) {
	this.studnetid = studnetid;
}


public String getStudentname() {
	return studentname;
}


public void setStudentname(String studentname) {
	this.studentname = studentname;
}


public float getStudentfees() {
	return studentfees;
}


public void setStudentfees(float studentfees) {
	this.studentfees = studentfees;
}


@Override
public String toString() {
	return "Student [studnetid=" + studnetid + ", studentname=" + studentname + ", studentfees=" + studentfees + "]";
}



}
