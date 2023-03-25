package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Appconfig;
import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext ac=new AnnotationConfigApplicationContext(Appconfig.class);
	Student s=(Student) ac.getBean("stu");
	System.out.println("   Student Name    :-"  +s.getName());
	System.out.println("   Student Rollno  :-"  +s.getRollno());
	}

}
