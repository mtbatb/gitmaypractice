package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ReplaceHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");   
	      System.out.println("Initial list of elements:");  
	      for(Entry<Integer, String> m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }   
	     System.out.println("Updated list of elements:");  
           //BLIND REPLACE using KEY 
	     hm.replace(102, "Gaurav");  //2 arguments
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	     System.out.println("Updated list of elements:"); 
	     //CONDITIONAL REPLACE using KEY & value 
	     hm.replace(101, "Vijay", "Ravi");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }   
	     System.out.println("Updated list of elements:");  
	    //blind replaces in entire HashMap
		
	     hm.replaceAll((k,v) -> "Ajay"); // --LAMBDA EXPRESSIONS  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  

	}

}
