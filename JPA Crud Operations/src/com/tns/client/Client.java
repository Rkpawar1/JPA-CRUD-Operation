package com.tns.client;

import com.tns.entity.Student;
import com.tns.services.StudentService;
import com.tns.services.StudentServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		
		// Create Operation
	     student.setStudentId(1);
		 student.setName("Rupesh");
		 service.addStudent(student);
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
	   // student = service.findStudentById(1);
		//System.out.print("id:"+student.getStudentId());
		//System.out.println(" name:"+student.getName()); 
		
		// Update Operation
		//student = service.findStudentById(1);
		//student.setName("Rupesh Pawar");
		//service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		//student = service.findStudentById(1);
		//System.out.print("id:"+student.getStudentId());
		//System.out.println(" name:"+student.getName()); 
		
		//at this breakpoint, record is removed from table
		// Delete Operation
		//student = service.findStudentById(1);
		//service.removeStudent(student);
		//System.out.println("End of program/Life cycle completed..."); 
		}
	
}



