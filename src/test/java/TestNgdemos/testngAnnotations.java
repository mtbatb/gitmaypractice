package TestNgdemos;

import org.testng.annotations.Test;

public class testngAnnotations {
	
	@Test
	public void method1()
	{
		System.out.println("Method1");
	}
	
	@Test()
	public void method2()
	{
		System.out.println("Method2");
	}
	
	@Test()
	public void method3()
	{
		System.out.println("Method3");
	}

}