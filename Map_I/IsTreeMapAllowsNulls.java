package com.java.Map_I;

import java.util.*;
import java.util.Map;

public class IsTreeMapAllowsNulls 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new TreeMap();
		m1.put(1,"pineapple");
		m1.put(2,"apple");
		m1.put(3,"apple");
		m1.put(4,"orange");
		m1.put(null,null);
		System.out.println(m1);
		 
	}
}
