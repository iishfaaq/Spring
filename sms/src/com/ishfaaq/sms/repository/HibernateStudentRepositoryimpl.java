package com.ishfaaq.sms.repository;

import java.util.ArrayList;
import java.util.List;

import com.ishfaaq.sms.model.Student;

public class HibernateStudentRepositoryimpl implements StudentRepository {
	
	public List<Student> fetchAllStudents(){
		List<Student> students = new ArrayList<>();
		
		Student student = new Student();
		student.setName("Krish");
		student.setCollege("Zahira");
		
		Student student2 = new Student();
		student2.setName("Ishfaaq");
		student2.setCollege("Roayal");
		
		students.add(student);
		students.add(student2);
		
		return students;
	}

}
