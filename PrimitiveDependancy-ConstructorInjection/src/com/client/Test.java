//Primitive Dependancy using constructo injection

package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
    ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
//	Student s1=(Student) ac.getBean("s");
    Student s1=ac.getBean(Student.class);
	s1.display();
  
	
	
	}

}
