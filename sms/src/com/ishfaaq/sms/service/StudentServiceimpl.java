package com.ishfaaq.sms.service;

import java.util.List;

import com.ishfaaq.sms.model.Student;
import com.ishfaaq.sms.repository.HibernateStudentRepositoryimpl;
import com.ishfaaq.sms.repository.StudentRepository;


public class StudentServiceimpl implements StudentService {
	
	// tight coupling 
	StudentRepository repository; //= new HibernateStudentRepositoryimpl();
	
	
	public StudentRepository getRepository() {
		return repository;
	}


	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}


	public List<Student> fetchAllStudents(){
		return repository.fetchAllStudents();
	}

}
