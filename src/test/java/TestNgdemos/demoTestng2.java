package TestNgdemos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demoTestng2 {
	
	@Test
	@Parameters("userdata")
	public void method1(String userdata)
	{
		String userInfo=userdata;
		System.out.println(userInfo);
	}

}
