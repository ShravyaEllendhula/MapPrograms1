package com.java.Map_I;

import java.util.*;
import java.util.Map;

public class AppendAtTheEnd 
{
	private static Map<String, Integer> psm = new HashMap<String, Integer>();

	private static Comparator<String> myComparator = new Comparator<String>() 
	{
	  public int compare(String s1, String s2) 
	  {
	    Integer i1 = psm.get(s1);
	    Integer i2 = psm.get(s2);

	    if (i1 == 0) return  1; //  i1 > i2
	    if (i2 == 0) return -1; //  i1 < i2

	    return i1.compareTo(i2);
	  } 
	};

	  public static void main (String[] args) throws java.lang.Exception 
	  {
	  psm.put("minus one", -1);
	  psm.put("zero", 0);
	  psm.put("one", 1);
	  psm.put("longest int value", Integer.MAX_VALUE);
	  psm.put("nothing", 0);
	  
	  Map<String, Integer> map = new TreeMap<String, Integer>(myComparator);
	  map.putAll(psm);

	  for(Map.Entry<String, Integer> entry:map.entrySet()) 
	  {
	    System.out.printf("%s = %s%n", entry.getKey(), entry.getValue());
	  }
	}
}
