package com.rajesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rajesh.dao.StudentDAO;
import com.rajesh.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO StudentDAO;

	@Override
	@Transactional
	public void addStudent(Student student) {
		StudentDAO.addStudent(student);
	}

	@Override
	@Transactional
	public List<Student> getAllStudents() {
		return StudentDAO.getAllStudents();
	}

	@Override
	@Transactional
	public void deleteStudent(Integer StudentId) {
		StudentDAO.deleteStudent(StudentId);
	}

	public Student getStudent(int empid) {
		return StudentDAO.getStudent(empid);
	}

	public Student updateStudent(Student Student) {
		// TODO Auto-generated method stub
		return StudentDAO.updateStudent(Student);
	}

	public void setStudentDAO(StudentDAO StudentDAO) {
		this.StudentDAO = StudentDAO;
	}

}
