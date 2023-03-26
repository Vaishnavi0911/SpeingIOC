//Primitive Dependancy using constructor injection

package com.model;

public class Student {
	
	private int rollno;
	
	private String sname;
	
	private String s_address;

	public Student(int rollno, String sname, String s_address) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.s_address = s_address;
	}
	
	public void display()
	{
		System.out.println(rollno);
		System.out.println(sname);
		System.out.println(s_address);
	}

	

}
