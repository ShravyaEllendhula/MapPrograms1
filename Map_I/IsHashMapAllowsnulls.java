package com.java.Map_I;

import java.util.HashMap;
import java.util.Map;

public class IsHashMapAllowsnulls 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap();
		m1.put(1,"pineapple");
		m1.put(2,"apple");
		m1.put(3,"apple");
		m1.put(null,null);
		m1.put(null,"banana");
		System.out.println(m1);
	}
}
