package com.java.Map_I;

import java.util.HashMap;
import java.util.Map;

public class RemoveParticularEntry 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap();
		m1.put(1,"Audi");
		m1.put(2,"tata");
		m1.put(3,"benz");
		m1.put(4,"taota");
		m1.put(5,"scoda");
		System.out.println("before removing:\n"+m1);
		m1.remove(2);
		System.out.println("After removing:\n"+m1);
		
	}
}
