package com.java.Map_I;

import java.util.HashMap;
import java.util.Map;

public class ParticularEntryprint 
{
	public static void main(String[] args)
	{
		Map<Integer,String> m1=new HashMap();
		m1.put(1,"pineapple");
		m1.put(2,"apple");
		m1.put(3,"apple");
		m1.put(4,"orange");
		m1.put(5,"banana");
		System.out.println(m1);
		System.out.println(m1.get(4));
		System.out.println(m1.getOrDefault(6, null));
	}
}
