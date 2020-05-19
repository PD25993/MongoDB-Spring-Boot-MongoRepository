package com.springboot.mongodb.sample.models;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Student")
public class Student {
	@Id
	private BigInteger id;;
	private String name;
	private String age;
	private String Technology;
	private String Country;
	private Double Contact;
}
