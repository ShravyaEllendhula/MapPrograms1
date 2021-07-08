package com.java.Map_I;

import java.util.*;
import java.util.Map.Entry;

public class MapGenrics 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new LinkedHashMap<>();
		m1.put(1, "white");
		m1.put(2, "Red");
		m1.put(3, "blue");
		m1.put(4, "block");
		m1.put(5, "pink");
		
		Set<Entry<Integer, String>> s1 =m1.entrySet();
		Iterator i1 = s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
