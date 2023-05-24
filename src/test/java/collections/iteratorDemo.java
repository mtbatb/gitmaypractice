package collections;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iteratorDemo {

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		
		
		list.add("Ravi1");//Adding object in arraylist
		
		  //list.add("Vijay"); 
		  
		 // list.add("Ravi"); list.add("Ajay");
		  

		//Traversing list through Iterator(Looping)  
		Iterator itr=list.iterator();  

		while(itr.hasNext())//conditonal check purpose
		   {  
		//code 
		//for(int i=1;i<=10;    i++)
		System.out.println(itr.next());  
		  }  
		 }  

	}

