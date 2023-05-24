package javaDemos;

import java.util.ArrayList;

public class arrayListDemo {
	
	public static void main(String[] args)
	{
		
		  //Arraylist created for string values stored values
		  ArrayList<String> list=new ArrayList<String>(); 
		  list.add("vimal");
		  
		  list.add("sonoo"); list.add("ratan"); list.add("Suresh123");
		  list.add("yognand"); list.add("Bhargav"); list.add("Mahesh");
		  list.add("prasad"); list.add("veeru"); 
		  //traversing the list of elements  using for-each loop 
		  for(String s:list){  //s map/associate
		  System.out.println(s); //printing the list of values 
		  }
		 

	}

}
