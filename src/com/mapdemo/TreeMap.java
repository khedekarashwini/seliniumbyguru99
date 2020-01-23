package com.mapdemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TreeMap {

	public static void main(String[] args) {
		Map<Integer, String> tm=new java.util.TreeMap<>();
		   tm.put(104, "k");
		   tm.put(100, "f");
		   tm.put(101, "a");
		   tm.put(105, "b");
		   System.out.println(tm);
Map<Integer, String> mp=Collections.synchronizedMap(new HashMap<>());
 	}

}
