package com.prathamesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prathamesh.dao.StudentDAO;
import com.prathamesh.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDAO studentDAO;
	
	public Student CreateStudent(Student student) {
		return studentDAO.save(student);
	}
	
	public List<Student> getAllStudent(){
		return studentDAO.findAll();
	}
	
	public Optional<Student> findStudentById(int id){
		return studentDAO.findById(id);
	}
	
	public Student updateStudent(Student student) {
		return studentDAO.save(student);
	}
	
	public String deleteStudent(int id) {
		studentDAO.deleteById(id);
		return "Delete Student Successfully!!!";
	}
}
