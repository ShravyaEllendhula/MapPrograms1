package com.java.Map_I;

import java.util.HashMap;
import java.util.Map;

public class CompareTwoHashMaps 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap();
		m1.put(1,"pineapple");
		m1.put(2,"apple");
		m1.put(3,"apple");
		m1.put(4,"orange");
		m1.put(5,"banana");
		Map<Integer,String> m2=new HashMap();
		m2.put(1,"pineapple");
		m2.put(2,"apple");
		m2.put(3,"apple");
		m2.put(4,"orange");
		m2.put(5,"banana");
		System.out.println(m1.equals(m2));
	}
}
