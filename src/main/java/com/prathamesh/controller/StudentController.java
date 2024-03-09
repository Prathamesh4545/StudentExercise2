package com.prathamesh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prathamesh.entity.Student;
import com.prathamesh.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("addStudent")
	public Student CreateStudent(@RequestBody Student student) {
		return studentService.CreateStudent(student);
	}
	
	@GetMapping("getAllStudent")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> findStudentById(@PathVariable Integer id) {
		return studentService.findStudentById(id);
	}
	
	@PutMapping("/student/update/{id}")
	public Student updateStudent(@PathVariable Integer id,@RequestBody Student student) {
		student.setId(id);
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/student/delete/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		return studentService.deleteStudent(id);
	}
}
