package com.java.Map_I;

import java.util.HashMap;

public class GetOnlyKeys 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> m1 = new HashMap<>();
		m1.put(1, "One");
		m1.put(2, "Two");
		m1.put(3,"Three");
		System.out.println("onlyKeys: "+m1.keySet());
		
	}
}
