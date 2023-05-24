package TestNgdemos;

import org.testng.annotations.Test;

public class TestDemoclass {

	@Test
	public static void Method1()
	{
		System.out.println("Method1");
	}
	@Test(enabled=false)
	public static void Method2()
	{
		System.out.println("Method2");
	}
	@Test
	public static void Method3()
	{
		System.out.println("Method 3");
	}
	
	//100==>random 10 methods-->90 1,2,3,

}
