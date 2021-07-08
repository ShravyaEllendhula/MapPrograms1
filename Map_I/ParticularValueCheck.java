package com.java.Map_I;

import java.util.HashMap;
import java.util.Map;

public class ParticularValueCheck 
{
	public static void main(String[] args) 
	{
			Map<Integer,String> m1=new HashMap();
			m1.put(1,"block-rose");
			m1.put(2,"pink-rose");
			m1.put(3,"white-rose");
			m1.put(4,"red-rose");
		    System.out.println(m1.containsValue("red-rose"));
		
	}
}
