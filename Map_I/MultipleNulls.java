package com.java.Map_I;

import java.util.Collections;
import java.util.*;
import java.util.Map;

public class MultipleNulls 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new LinkedHashMap();
		m1.put(1,"tiger");
		m1.put(2,"monkey");
		m1.put(3,"horse");
		m1.put(4,"Lion");
		m1.put(null,null);
		m1.put(null,"hair");
		m1.put(null,null);
		System.out.println(m1);
		
	}
}
