package com.springboot.mongodb.sample.controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongodb.sample.dao.StudentDao;
import com.springboot.mongodb.sample.models.Student;

@RestController
@RequestMapping("/students")
public class StudentRestController {
	
	@Autowired
    private StudentDao studentDao;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> saveOrUpdateStudent(@RequestBody Student student) {
        studentDao.saveOrUpdateStudent(student);
        return new ResponseEntity<Student>(HttpStatus.OK);
    } 
    
    @DeleteMapping(value = "/{id}")
    public void deleteStudent(@PathVariable BigInteger id) {
        studentDao.deleteStudent(studentDao.getStudentById(id).getId());
    }

}
