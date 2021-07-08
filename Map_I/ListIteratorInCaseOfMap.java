package com.java.Map_I;

import java.util.*;

public class ListIteratorInCaseOfMap 
{
	public static void main(String[] args) 
	{
		Map<String,String> m1=new LinkedHashMap();
		m1.put("hyd-basar-Train: ", "AjanthaExpress");
		m1.put("hyd-Thirupathi-Train: ","KrishnaExpress");
		
		System.out.println("******using set after map-set conversion*******");
		Set<Map.Entry<String, String>> set=m1.entrySet();
		for(Map.Entry<String, String> set1:set)
		{
			System.out.println(set1);
		}
		System.out.println("******after set to list conversion:*********");
		List l1=new LinkedList(set);
		ListIterator list=l1.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
	}
}
