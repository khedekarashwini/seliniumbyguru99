package com.mapdemo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	ArrayList l1=new ArrayList<>();
	
	l1.add(12);
	l1.add(10);
	l1.add(120);
	l1.add(89);
	l1.add(33);
	
	Collections.sort(l1);
	System.out.println(l1);
	
	String s1="Welcome to Harman";
	 int s= s1.length();
	System.out.println(s);
	
	   String a=s1.replaceAll("\\s", "");
	System.out.println(a);
	}

	
}
