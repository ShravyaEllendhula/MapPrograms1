package com.java.Map_I;

import java.util.*;
import java.util.Map.Entry;

public class UserDefinedDuplicatesWithTreeMap 
{
	public static void main(String[] args) 
	{
		Map<Student,String> m1=new TreeMap<Student,String>();
		Student s1=new Student(100, "Shravya");
		Student s2=new Student(100, "Shravya");
		m1.put(s1, "student1");
		m1.put(s2, "Student2");
		
		Set<Entry<Student, String>> set=m1.entrySet();
		Iterator i1=set.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	}
}
