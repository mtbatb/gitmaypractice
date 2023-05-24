package TestNgdemos;

import org.testng.annotations.Test;

public class loginDependent {

	
	 @Test  
	 public void login()  
	 {  
	     System.out.println("Login page");  
	     
	 }  
	 @Test(dependsOnMethods="login")  
	 public void home()  
	 {  
	     System.out.println("Home page");  
	       
	 } 
	 
	 @Test  
	 public void registration()  
	 {  
	     System.out.println("Registration page");  
	       
	 } 
	
}
