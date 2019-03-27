package com.ishfaaq.sms;

import java.util.List;

import com.ishfaaq.sms.model.Student;
import com.ishfaaq.sms.service.StudentService;
import com.ishfaaq.sms.service.StudentServiceimpl;

public class Application {

	public static void main(String[] args) {
		StudentService service = new StudentServiceimpl();
		List<Student> students = service.fetchAllStudents();
		
		for(Student student : students) {
			System.out.println("name is "+ student.getName() + " college is " + student.getCollege() );
		}
		

	}

}
