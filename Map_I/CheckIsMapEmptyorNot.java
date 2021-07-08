package com.java.Map_I;

import java.util.*;

public class CheckIsMapEmptyorNot 
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
		if(m1.isEmpty())
		{
			System.out.println("map is empty");
		}
		else
		{
			System.out.println("map is not empty");
		}
	}
}
