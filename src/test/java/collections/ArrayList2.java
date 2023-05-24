package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  

		  //Traversing list through Iterator(Looping)  
		  Iterator itr=list.iterator();  
		  while(itr.hasNext())//conditonal check purpose
		   {  
		  //code 
		  
		   System.out.println(itr.next());  
		  }  
		 }  
	


}
