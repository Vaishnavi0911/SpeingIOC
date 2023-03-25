package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration
public class Appconfig {

	@Bean
	public Student stu()
	{
		Student s1=new Student();
		s1.setName("Vaishnavi");
		s1.setRollno(111);
		return s1;

	}
}
