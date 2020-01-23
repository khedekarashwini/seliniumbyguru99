package com.mapdemo;

public class Dash1 {

	public static void main(String[] args) {
		String t="Haraman";
		//int s
	//for(int j=0;j<t;j++)
	{
		int len=t.length();
		  int even=0;
	      int odd=0;
	   char stre[]=new char[90];
	   char stro[]=new char[90];
	   
	   for(int i=0;i<len;i++)
	   {
		  if(i%2==0)
		  {
			  stre[even]=t.charAt(i);
			  even++;
		  }
		  if(i%2==1)
		  {
			  stro[odd]=t.charAt(i);
			  odd++;
			  
		  }
	   }
System.out.println("Even"+even);
System.out.println(odd);
	}
	}
}
