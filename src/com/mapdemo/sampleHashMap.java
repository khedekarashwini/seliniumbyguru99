package com.mapdemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class sampleHashMap {

	public static void main(String[] args) {
		Map<String, Integer> hs=new HashMap<>();
		   hs.put("Ashu", 1000);
		   hs.put("Datta", 2000);
		  System.out.println( hs.put("Ashu", 8000));
		   hs.put("Ritu", 4000);
		   hs.put("Anita", 100);
		   hs.put("Anil", 00);

		  System.out.println(hs);
 // System.out.println(hs.keySet());
 // System.out.println(hs.values());
 
  
  Set s= hs.entrySet();
  
  Iterator ltr= s.iterator();
  
  while (ltr.hasNext()) {
	Map.Entry me=(Entry) ltr.next();
	//System.out.println(me.getKey()+" "+me.getValue());
	if(me.getKey().equals("Datta"))
	{
		 me.setValue(10000);
	}
System.out.println(me);


  }
	}

}
