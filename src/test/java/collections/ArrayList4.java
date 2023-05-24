package collections;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>(); 
        al.add("Ravi"); //index starts with 0   
        al.add("Vijay");   
        al.add("Ajay"); //index of ajay 2  
        al.add("Anuj");  
        al.add("Gaurav");
      
	    
        System.out.println("An initial list of elements: "+al);   
        //Removing specific element from arraylist  
        al.remove("Vijay"); //by text/string 

        System.out.println("After invoking remove(object) method: "+al);   
        //Removing element on the basis of specific position  
        //al.remove(4); by index removing 
        
        System.out.println("After invoking remove(index) method: "+al);   
          
        //Creating another arraylist  
        ArrayList<String> al2=new ArrayList<String>();    
        al2.add("Ravi");    
        al2.add("Hanumat"); //100s element   
        //Adding new elements to existing arraylist  
        al.addAll(al2); //bulk insertion 

        System.out.println("Updated list : "+al);   
        //Removing all the  elements from arraylist  
        //al.removeAll(al2);  //bilnd by remove/clear
        System.out.println("After invoking removeAll() method: "+al);  

        //Removing elements on the basis of specified condition  
        //al.removeIf(str -> str.contains("Ravi"));   //Here, we are using Lambda expression   
        System.out.println("After invoking removeIf() method: "+al);  
        //Removing all the elements available in the list  
        //al.clear();  //bilnd by remove/clear
        System.out.println("After invoking clear() method: "+al);   


	}

}
