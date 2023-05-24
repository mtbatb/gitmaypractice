package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class setExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Set<String> data = new LinkedHashSet<String>();   
		    
	        data.add("JavaTpoint");   
	        data.add("Set");   
	        data.add("Example");
	        data.add("JavaTpoint");   
	        data.add("Set");   
	        data.add("Example"); 
	        data.add("Example");
	           
	        System.out.println(data);  
	        
	        //Set<String> data1=new Set<String>();

	}

}
