package TestNgdemos;

import org.testng.annotations.Test;

public class Testclass {
	
	
	@Test
	public static void method1()
	{
		System.out.println("method1....");
	}

	@Test(enabled=false)
	public static void method2()
	{
		System.out.println("method2....");
	}
	
	
	
	 @Test(enabled=false)
	 public static void method3() 
	 { 
		 System.out.println("method3....");
	} 
	 @Test
	 public void method4()
	 {
		 System.out.println("Method4");
	 }
	 
	
}
