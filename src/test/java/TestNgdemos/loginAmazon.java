package TestNgdemos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginAmazon {
	
	
	@Test
	@Parameters({ "username", "password" })
	public void loginAmazonTest(String username,String password)
	{
		System.out.println("user credetnails");
		
		String myUsername=username;
		System.out.println(myUsername);
		
		String mypassword=password;
		System.out.println(mypassword);
		
	}

}
