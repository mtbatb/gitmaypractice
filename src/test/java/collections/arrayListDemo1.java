package collections;

import java.util.ArrayList;

public class arrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Ravi");//Adding object in arraylist (0,1,2,3,4)   
	      list.add("1.000");  //0,1,2,3,4,5  
	      list.add("YOga");   
	      list.add("Ajay"); 
		list.add("Ravi2");
	      list.add("test123$");
	     
	      //Invoking arraylist object   
	      System.out.println(list.get(4));  
	  }  

	}


