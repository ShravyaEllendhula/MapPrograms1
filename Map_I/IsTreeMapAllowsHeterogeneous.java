package com.java.Map_I;

import java.util.*;
import java.util.Map;

public class IsTreeMapAllowsHeterogeneous 
{
	public static void main(String[] args) 
	{
		Map m1 = new TreeMap();
		m1.put(1,"pineapple");
		m1.put(2,"apple");
		m1.put(3,"apple");
		m1.put(4,"orange");
		m1.put(5,"banana");
		m1.put(true, "dates");
		System.out.println(m1);
		
	}
}
