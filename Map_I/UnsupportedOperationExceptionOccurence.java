package com.java.Map_I;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnsupportedOperationExceptionOccurence 
{
	public static void main(String[] args)
	{
		Map<Integer,String> m1=new HashMap();
		m1.put(1,"tiger");
		m1.put(2,"monkey");
		m1.put(3,"horse");
		m1.put(4,"Lion");
		
		Map<Integer,String> m2=Collections.unmodifiableMap(m1);
		m2.put(5, "hair");
		System.out.println(m2);
	}
}
