package com.java.Map_I;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapThreadSafe 
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
		Map m2=Collections.synchronizedMap(m1);
		Set<Entry<Integer, String>> s1=m2.entrySet();
		synchronized(m2)
		{
			Iterator i1=s1.iterator();
			while(i1.hasNext())
			{
			    Map.Entry me=(Entry) i1.next();
				System.out.print(me.getKey()+" : ");
				System.out.println(me.getValue());
			}
		}
	}
}
