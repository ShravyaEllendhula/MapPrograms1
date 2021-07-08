package com.java.Map_I;

import java.util.HashMap;
import java.util.Map;

public class ReplaceParticularEntry
{
	public static void main(String[] args) 
	{
			Map<Integer,String> m1=new HashMap<>();
			m1.put(1,"flowers");
			m1.put(2,"animals");
			m1.put(3,"fruits");
			m1.put(4,"cars");
			System.out.println("before replacing: \n"+m1);
		    m1.replace(4,"colors");
		    System.out.println("after replacing: \n"+m1);
		
	}
}
