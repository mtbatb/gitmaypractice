package collections;

import java.util.ArrayList;

public class ArrayList3 {
	 
	
	 public static void main(String args[]){  
	  ArrayList<String> al=new ArrayList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	   //Traversing list through for-each loop  
	  for(String obj:al) //syntax 
	    System.out.println(obj);  
	 }  
	}  

