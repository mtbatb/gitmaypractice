package TestNgdemos;

import org.testng.annotations.Test;

public class TestInvocationCountDemo {
	
	@Test
	public void Method1()
	{
		System.out.println("Method1....");
	}
	
	
	@Test(enabled =false)
	public void Method2()
	{
		System.out.println("Method2....");
	}
	
	

}


