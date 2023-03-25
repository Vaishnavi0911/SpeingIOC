//Primitive Dependancy using setter injection

package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
    ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
	Student s1=(Student) ac.getBean("s");
	System.out.println("   Student Rollno   :-"  +s1.getRollno());
	System.out.println("   Student Name     :-"  +s1.getSname());
	System.out.println("   House Number     :-"  +s1.getAdr().getHousenu());
	System.out.println("   House Name       :-"  +s1.getAdr().getHousename());
    
  
	
	
	}

}
