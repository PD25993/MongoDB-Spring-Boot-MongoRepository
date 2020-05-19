package com.springboot.mongodb.sample.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mongodb.sample.models.Student;
import com.springboot.mongodb.sample.repository.IStudentRepository;


@Service
public class StudentDao {
	
	@Autowired
	IStudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		List<Student> listProducts= new ArrayList<Student>(); 
		listProducts = studentRepository.findAll();
		return listProducts;
	}
	
	public Student getStudentById(BigInteger id) {
		Optional<Student> studentDetailsFindById = studentRepository.findById(id);
		if(studentDetailsFindById.isPresent()) {
			return studentDetailsFindById.get();
		}else {
			return null;
		}
	}
	
	public Student saveOrUpdateStudent(Student product) {
		return studentRepository.save(product);
	}

	public void deleteStudent(BigInteger id) {
		studentRepository.deleteById(id);
	}

}
