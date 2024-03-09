package com.prathamesh.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prathamesh.entity.Student;

public interface StudentDAO extends JpaRepository<Student, Integer>{

}
