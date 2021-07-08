package com.java.Map_I;

import java.util.HashMap;
import java.util.Map;

public class CopyingMap 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap<>();
		m1.put(1,"pineapple");
		m1.put(2,"apple");
		m1.put(3,"apple");
		m1.put(4,"orange");
		m1.put(5,"banana");
		System.out.println("before copying m1: "+m1);
		Map<Integer,String> m2=new HashMap();
		m2.putAll(m1);
		System.out.println("m2 after copying: ");
		for(Map.Entry<Integer,String> entry :m1.entrySet())
		{
			System.out.println(entry);
			//m2.put( entry.getKey(),entry.getValue());
			 
		}
		
	}
}
