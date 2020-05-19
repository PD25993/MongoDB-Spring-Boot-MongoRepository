package com.springboot.mongodb.sample.repository;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mongodb.sample.models.Student;


@Repository
public interface IStudentRepository extends MongoRepository<Student, BigInteger>{

}
