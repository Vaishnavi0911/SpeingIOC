package com.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
     ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
	
	Student s1=(Student) ac.getBean("s");
	System.out.println(s1);
	
	System.out.println(s1.getName());
	s1.display();	
	System.out.println(" " + " ");
	
	
	System.out.println( s1.getRollno());
	s1.diaplay1();
	System.out.println(" " + " ");
	
	
	System.out.println(s1.getStudentId());
	s1.display3();
	

	
	
		
		
	}		
	}	
	


