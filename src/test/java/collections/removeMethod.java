package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> data = new LinkedHashSet<Integer>();   
        data.add(31);   
        data.add(21);   
        data.add(41);   
        data.add(51);   
        data.add(11);   
        data.add(81);   
        System.out.println("data: " + data);  
          
        data.remove(81);  
        data.remove(21);  
        data.remove(11);      
        System.out.println("data after removing elements: " + data);  

	}

}
