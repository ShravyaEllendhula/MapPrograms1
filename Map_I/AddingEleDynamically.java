package com.java.Map_I;

import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

public class AddingEleDynamically 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your size");
		int size=scan.nextInt();
		
		Map<Integer,String> m1=new HashMap();
		System.out.println("Enter your key and value");
		for(int i=0;i<size;i++)
		{
			 int ele=scan.nextInt();
			 String value=scan.next();
			 m1.put(ele, value);
		}
		Set<Entry<Integer,String>>s1=m1.entrySet();
		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
