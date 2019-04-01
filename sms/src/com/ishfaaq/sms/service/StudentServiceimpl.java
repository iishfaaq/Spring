	package com.ishfaaq.sms.service;
	
	import java.util.List;
	
	import com.ishfaaq.sms.model.Student;
	import com.ishfaaq.sms.repository.HibernateStudentRepositoryimpl;
	import com.ishfaaq.sms.repository.StudentRepository;
	
	
	public class StudentServiceimpl implements StudentService {
		
		// tight coupling 
		StudentRepository studentrepository; //= new HibernateStudentRepositoryimpl();
		
		public StudentServiceimpl() {
			System.out.println("Default constructer fired");
		}
		
		public StudentServiceimpl(StudentRepository repository) {
			System.out.println("constructoer fired");
			this.studentrepository = repository;
		}
		
		
		public StudentRepository getStudentRepository() {
			return studentrepository;
		}
	
	
		public void setStudentRepository(StudentRepository repository) {
			System.out.println("Setter Fiered");
			this.studentrepository = repository;
		}
	
	
		public List<Student> fetchAllStudents(){
			return studentrepository.fetchAllStudents();
		}
	
	}
