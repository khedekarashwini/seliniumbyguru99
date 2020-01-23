package com.mapdemo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue p=new PriorityQueue<>();
  p.offer("a");
  p.offer("z");
  p.offer("l");
  p.offer("b");
  p.offer("c");
  
  System.out.println(p);
  
  
	
	}
class mycom implements Comparator<String>
{
  public int compares(Object o1,Object o2)
  {
	  
   String s1=(String) o1;
   String s2=o2.toString();
   
   return s2.compareTo(s1);
  }

@Override
public int compare(String o1, String o2) {
	// TODO Auto-generated method stub
	return 0;
}

}
}
