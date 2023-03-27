package com.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student
{
	
	private List<String> name;
	
	private  Set<Integer> rollno;
	
	private Map<String,Integer> StudentId;
	

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Set<Integer> getRollno() {
		return rollno;
	}

	public void setRollno(Set<Integer> rollno) {
		this.rollno = rollno;
	}

	public Map<String, Integer> getStudentId() {
		return StudentId;
	}

	public void setStudentId(Map<String, Integer> studentId) {
		StudentId = studentId;
	}
	
	
	
	public void display()
	{	
		Iterator<String> itr = name.iterator();
		while(itr.hasNext())
		{
			String s1 = itr.next();
			System.out.println(s1);			
		}		
	}
	
	
	
	public void diaplay1()
	{

	Iterator<Integer> itr2 = rollno.iterator();	
	while(itr2.hasNext())
	{
		Integer i = itr2.next();
		System.out.println(i);
	}	
	}
	
	public void display3()
	{
		Set<String> key = StudentId.keySet();
		System.out.println(key);
		for(String k:key)
		{
			System.out.println(k);
			
			
		}
	}
	
	

}
