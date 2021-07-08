package com.java.Map_I;

import java.util.*;
import java.util.Map.Entry;

 
public class CreatingHashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> m1 = new HashMap<>();
		m1.put(1, "One");
		m1.put(2, "Two");
		m1.put(3,"Three");
		
		Set<Entry<Integer,String>> s1=m1.entrySet();
		Iterator i1 = s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
