package com.tns.services;

import com.tns.Dao.StudentDao;
import com.tns.Dao.StudentDaoImpl;
import com.tns.entity.Student;

public class StudentServiceImpl implements StudentService 
{
	private StudentDao dao;
	public StudentServiceImpl() 
	 {
	dao = new StudentDaoImpl();
	}
	
	@Override
	public void addStudent(Student student) 
	{
	
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void updateStudent(Student student)
	{
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void removeStudent(Student student)
	{
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}

	@Override
	public Student findStudentById(int id) 
	{
		Student student = dao.getStudentById(id);
		return student;
	}
	
}
