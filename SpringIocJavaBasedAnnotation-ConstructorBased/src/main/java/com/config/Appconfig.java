package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration
public class Appconfig {
	
	@Bean
	public Student s()
	{
		Student stu=new Student(100, "Sanvi");
		return stu;
	}

}
