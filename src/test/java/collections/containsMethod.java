package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class containsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> data = new LinkedHashSet<Integer>();   
        data.add(31);   
        data.add(21);   
        data.add(41);   
        data.add(51);   
        data.add(11);   
        data.add(81);   
        System.out.println("Set: " + data);  
        System.out.println("Does the Set contains '91'?" + data.contains(91));   
        System.out.println("Does the Set contains 'javaTpoint'? " + data.contains("4"));  
        System.out.println("Does the Set contains '51'? " + data.contains(51));  
        data.clear();
        System.out.println("Set after clear Method:"+data);

	}

}
