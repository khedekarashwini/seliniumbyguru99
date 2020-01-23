package com.mapdemo;

import java.util.HashMap;
import java.util.Iterator;

public class LinkedHashMap {

	public static void main(String[] args) {
	java.util.LinkedHashMap<Integer, String> h=new java.util.LinkedHashMap<>();

	h.put(1, "A");
	h.put(2, "B");

	h.put(3, "C");
	h.put(4, "D");
System.out.println(h);

h.getOrDefault(2, "ashu");
System.out.println(h);


/*h.forEach((k,v) ->{
	System.out.println("Key"+k+" "+"Value"+v);
	
	
} );

Iterator<Integer> ltr=h.keySet().iterator();
while(ltr.hasNext())
{
  Integer l= (Integer) ltr.next();	
  System.out.println("Key "+l+"   "+"Values "+h.get(l));
  
}
*/	}

}
