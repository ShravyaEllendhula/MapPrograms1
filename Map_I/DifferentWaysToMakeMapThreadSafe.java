package com.java.Map_I;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DifferentWaysToMakeMapThreadSafe 
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
		//1st way
		Map<Integer,String> m2=Collections.synchronizedMap(m1);
		
		//2nd way
		Map <Integer,String> m3=new ConcurrentHashMap<Integer, String>(m1);
		m3.put(1,"tiger");
		m3.put(2,"monkey");
		m3.put(3,"horse");
		m3.put(4,"Lion");
		System.out.println(m3);
	}
}
