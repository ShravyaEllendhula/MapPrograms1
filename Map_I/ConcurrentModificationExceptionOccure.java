package com.java.Map_I;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConcurrentModificationExceptionOccure 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1,"block-rose");
		m1.put(2,"pink-rose");
		m1.put(3,"white-rose");
		m1.put(4,"red-rose");
		
		Set<Entry<Integer,String>> s1= m1.entrySet();
//		for(Map.Entry<Integer, String> m2:s1)
//		{
//			int keys=m2.getKey();
//			if(keys==2)
//			{
//				m1.remove(keys);
//			}
//			else
//			{
//				System.out.println(m2.getKey()+" : "+m2.getValue());
//			}
//		}
		
		Iterator<Entry<Integer, String>> itr = s1.iterator();
         while(itr.hasNext()) 
         {
            Entry<Integer, String> entry = itr.next();
            int key = entry.getKey();
            if(key == 2) 
            {
                itr.remove();
                System.out.println("2nd item safely removed using Iterator");
            }
            else
            {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }
         }
	}
}
